package com.sholehbashi.app.ui.history

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sholehbashi.app.R
import com.sholehbashi.app.ui.common.CenteredColumn
import com.sholehbashi.app.ui.common.RecipeCard
import com.sholehbashi.app.ui.common.ScreenScaffold
import com.sholehbashi.app.util.appViewModel

@Composable
fun HistoryScreen(onBack: () -> Unit) {
    val vm = appViewModel { HistoryViewModel(it) }
    val items by vm.items.collectAsStateWithLifecycle()

    ScreenScaffold(title = stringResource(R.string.menu_history), onBack = onBack) { padding ->
        if (items.isEmpty()) {
            Box(Modifier.fillMaxSize().padding(padding).padding(32.dp), contentAlignment = Alignment.Center) {
                Text("هنوز غذایی تایید نکردی.")
            }
        } else {
            CenteredColumn(padding) {
                items.forEach { RecipeCard(it) }
            }
        }
    }
}
