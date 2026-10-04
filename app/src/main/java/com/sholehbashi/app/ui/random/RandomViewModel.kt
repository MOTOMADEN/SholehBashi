package com.sholehbashi.app.ui.random

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sholehbashi.app.AppContainer
import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.MealMarkEntity
import com.sholehbashi.app.data.db.RecipeEntity
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class RandomViewModel(private val c: AppContainer) : ViewModel() {

    private val _recipe = MutableStateFlow<RecipeEntity?>(null)
    val recipe: StateFlow<RecipeEntity?> = _recipe.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    val marks: StateFlow<List<String>> = _recipe
        .flatMapLatest { r -> if (r == null) flowOf(emptyList()) else c.db.markDao().observeMarks(r.id) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    init {
        next()
    }

    fun next() {
        viewModelScope.launch {
            c.ensureSeeded()
            _recipe.value = c.db.recipeDao().random()
        }
    }

    fun toggleMark(mark: String) {
        val r = _recipe.value ?: return
        viewModelScope.launch {
            if (mark in marks.value) c.db.markDao().remove(r.id, mark)
            else c.db.markDao().add(MealMarkEntity(r.id, mark))
        }
    }

    fun addUserRecipe(title: String, ingredients: String, instructions: String) {
        viewModelScope.launch {
            c.db.recipeDao().insert(
                RecipeEntity(
                    title = title,
                    ingredients = ingredients,
                    instructions = instructions,
                    source = Source.USER,
                )
            )
        }
    }
}
