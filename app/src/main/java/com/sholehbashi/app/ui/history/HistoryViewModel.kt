package com.sholehbashi.app.ui.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sholehbashi.app.AppContainer
import com.sholehbashi.app.data.db.RecipeEntity
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class HistoryViewModel(c: AppContainer) : ViewModel() {
    val items: StateFlow<List<RecipeEntity>> = c.db.historyDao().observeRecipes()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())
}
