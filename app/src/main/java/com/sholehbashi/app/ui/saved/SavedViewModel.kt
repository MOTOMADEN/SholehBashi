package com.sholehbashi.app.ui.saved

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sholehbashi.app.AppContainer
import com.sholehbashi.app.data.MarkType
import com.sholehbashi.app.data.db.MealMarkEntity
import com.sholehbashi.app.data.db.RecipeEntity
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SavedViewModel(private val c: AppContainer) : ViewModel() {
    val favorites: StateFlow<List<RecipeEntity>> = c.db.markDao().observeRecipes(MarkType.FAVORITE)
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    val cookLater: StateFlow<List<RecipeEntity>> = c.db.markDao().observeRecipes(MarkType.COOK_LATER)
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    fun removeMark(recipeId: Long, mark: String) {
        viewModelScope.launch { c.db.markDao().remove(recipeId, mark) }
    }

    fun addMark(recipeId: Long, mark: String) {
        viewModelScope.launch { c.db.markDao().add(MealMarkEntity(recipeId, mark)) }
    }
}
