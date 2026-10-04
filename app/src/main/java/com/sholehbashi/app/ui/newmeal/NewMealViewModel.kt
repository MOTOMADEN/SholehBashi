package com.sholehbashi.app.ui.newmeal

import android.os.Build
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sholehbashi.app.AppContainer
import com.sholehbashi.app.data.PrefType
import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.api.MealDto
import com.sholehbashi.app.data.api.SuggestRequest
import com.sholehbashi.app.data.db.HistoryEntity
import com.sholehbashi.app.data.db.MealMarkEntity
import com.sholehbashi.app.data.db.RecipeEntity
import com.sholehbashi.app.data.db.UserPrefEntity
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class MealResult(
    val dto: MealDto,
    val recipeId: Long? = null,
    val marks: Set<String> = emptySet(),
    val confirmed: Boolean = false,
)

data class NewMealUiState(
    /** PrefType -> values selected for THIS request */
    val selected: Map<String, Set<String>> = emptyMap(),
    val goal: String = "none",
    val wish: String = "",
    val mealType: String = "any",
    val region: String = "any",
    val loading: Boolean = false,
    val error: String? = null,
    val results: List<MealResult> = emptyList(),
)

class NewMealViewModel(private val c: AppContainer) : ViewModel() {

    private val prefDao = c.db.prefDao()
    private val markDao = c.db.markDao()

    private val _ui = MutableStateFlow(NewMealUiState())
    val ui: StateFlow<NewMealUiState> = _ui.asStateFlow()

    /** Everything the user has ever typed (suggestions), newest first. Filter by type in the UI. */
    val saved: StateFlow<List<UserPrefEntity>> = prefDao.observeAll()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    // ---- preferences (want / avoid / allergy / diet) ----

    /** New text: store it for future suggestions AND select it for this request. */
    fun addPref(type: String, value: String) {
        val v = value.trim()
        if (v.isEmpty()) return
        viewModelScope.launch { prefDao.add(UserPrefEntity(type = type, value = v)) }
        select(type, v)
    }

    fun select(type: String, value: String) = _ui.update { s ->
        s.copy(selected = s.selected + (type to (s.selected[type].orEmpty() + value)))
    }

    fun unselect(type: String, value: String) = _ui.update { s ->
        s.copy(selected = s.selected + (type to (s.selected[type].orEmpty() - value)))
    }

    /** Remove from the saved suggestions (e.g. a typo from last time). */
    fun deleteSaved(pref: UserPrefEntity) {
        unselect(pref.type, pref.value)
        viewModelScope.launch { prefDao.remove(pref.id) }
    }

    // ---- form ----

    fun setGoal(goal: String) = _ui.update { it.copy(goal = goal) }
    fun setWish(text: String) = _ui.update { it.copy(wish = text) }
    fun setMealType(key: String) = _ui.update { it.copy(mealType = key) }
    fun setRegion(key: String) = _ui.update { it.copy(region = key) }

    // ---- API call ----

    fun generate() {
        val s = _ui.value
        if (s.loading) return
        _ui.update { it.copy(loading = true, error = null, results = emptyList()) }
        viewModelScope.launch {
            try {
                val request = SuggestRequest(
                    wants = s.selected[PrefType.WANT].orEmpty().toList(),
                    avoids = s.selected[PrefType.AVOID].orEmpty().toList(),
                    allergies = s.selected[PrefType.ALLERGY].orEmpty().toList(),
                    diets = s.selected[PrefType.DIET].orEmpty().toList(),
                    goal = s.goal,
                    wish = s.wish.trim(),
                    mealType = s.mealType,
                    region = s.region,
                    deviceModel = Build.MODEL,
                    androidSdk = Build.VERSION.SDK_INT,
                )
                val response = c.api.suggest(request)
                _ui.update { it.copy(loading = false, results = response.meals.take(3).map { m -> MealResult(m) }) }
            } catch (e: CancellationException) {
                throw e
            } catch (e: Exception) {
                _ui.update { it.copy(loading = false, error = "دریافت پیشنهاد ممکن نشد. اتصال اینترنت را بررسی کن و دوباره امتحان کن.") }
            }
        }
    }

    // ---- results: mark / confirm ----

    private fun updateResult(index: Int, transform: (MealResult) -> MealResult) = _ui.update { s ->
        s.copy(results = s.results.mapIndexed { i, r -> if (i == index) transform(r) else r })
    }

    /** AI meals are stored as recipes (source=ai) the first time the user marks or confirms them. */
    private suspend fun ensureSaved(index: Int): Long {
        val state = _ui.value
        val result = state.results[index]
        result.recipeId?.let { return it }
        val id = c.db.recipeDao().insert(
            RecipeEntity(
                title = result.dto.title,
                ingredients = result.dto.ingredients,
                instructions = result.dto.instructions,
                mealType = state.mealType,
                region = state.region,
                source = Source.AI,
            )
        )
        updateResult(index) { it.copy(recipeId = id) }
        return id
    }

    fun toggleMark(index: Int, mark: String) {
        viewModelScope.launch {
            val id = ensureSaved(index)
            val has = mark in _ui.value.results[index].marks
            if (has) markDao.remove(id, mark) else markDao.add(MealMarkEntity(id, mark))
            updateResult(index) { it.copy(marks = if (has) it.marks - mark else it.marks + mark) }
        }
    }

    fun confirm(index: Int) {
        viewModelScope.launch {
            val id = ensureSaved(index)
            c.db.historyDao().add(HistoryEntity(recipeId = id, confirmedAt = System.currentTimeMillis()))
            updateResult(index) { it.copy(confirmed = true) }
        }
    }
}
