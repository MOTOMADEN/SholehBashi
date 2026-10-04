package com.sholehbashi.app.ui.saved

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sholehbashi.app.R
import com.sholehbashi.app.data.MarkType
import com.sholehbashi.app.ui.common.CenteredColumn
import com.sholehbashi.app.ui.common.RecipeCard
import com.sholehbashi.app.ui.common.ScreenScaffold
import com.sholehbashi.app.util.appViewModel

@Composable
fun SavedScreen(onBack: () -> Unit) {
    val vm = appViewModel { SavedViewModel(it) }
    val favorites by vm.favorites.collectAsStateWithLifecycle()
    val cookLater by vm.cookLater.collectAsStateWithLifecycle()
    var tab by rememberSaveable { mutableIntStateOf(0) }

    ScreenScaffold(title = stringResource(R.string.menu_saved), onBack = onBack) { padding ->
        Column(Modifier.padding(padding)) {
            TabRow(selectedTabIndex = tab, containerColor = Color.Transparent) {
                Tab(selected = tab == 0, onClick = { tab = 0 }, text = { Text("پسند شده‌ها") })
                Tab(selected = tab == 1, onClick = { tab = 1 }, text = { Text("برای آینده") })
            }
            val items = if (tab == 0) favorites else cookLater
            val mark = if (tab == 0) MarkType.FAVORITE else MarkType.COOK_LATER
            if (items.isEmpty()) {
                Box(Modifier.fillMaxSize().padding(32.dp), contentAlignment = Alignment.Center) {
                    Text("هنوز چیزی نشان نکردی.")
                }
            } else {
                CenteredColumn(PaddingValuesZero) {
                    items.forEach { recipe ->
                        RecipeCard(recipe) {
                            IconButton(onClick = { vm.removeMark(recipe.id, mark) }) {
                                Icon(Icons.Filled.Close, contentDescription = "برداشتن نشان")
                            }
                        }
                    }
                }
            }
        }
    }
}

private val PaddingValuesZero = androidx.compose.foundation.layout.PaddingValues(0.dp)
