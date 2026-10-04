package com.sholehbashi.app.ui.random

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Casino
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sholehbashi.app.R
import com.sholehbashi.app.ui.common.AddRecipeDialog
import com.sholehbashi.app.ui.common.CenteredColumn
import com.sholehbashi.app.ui.common.MarkActions
import com.sholehbashi.app.ui.common.RecipeCard
import com.sholehbashi.app.ui.common.ScreenScaffold
import com.sholehbashi.app.util.appViewModel
import androidx.compose.ui.res.stringResource

@Composable
fun RandomScreen(onBack: () -> Unit) {
    val vm = appViewModel { RandomViewModel(it) }
    val recipe by vm.recipe.collectAsStateWithLifecycle()
    val marks by vm.marks.collectAsStateWithLifecycle()
    var showAdd by remember { mutableStateOf(false) }

    ScreenScaffold(
        title = stringResource(R.string.menu_random),
        onBack = onBack,
        floatingActionButton = {
            FloatingActionButton(onClick = { showAdd = true }) {
                Icon(Icons.Filled.Add, contentDescription = "افزودن غذای خودم")
            }
        },
    ) { padding ->
        CenteredColumn(padding) {
            AnimatedContent(
                targetState = recipe,
                transitionSpec = {
                    (fadeIn(tween(350)) + slideInVertically(tween(350)) { it / 8 }) togetherWith
                        (fadeOut(tween(200)) + slideOutVertically(tween(200)) { -it / 8 })
                },
                label = "randomRecipe",
            ) { r ->
                if (r == null) {
                    Box(Modifier.fillMaxWidth().padding(48.dp), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator()
                    }
                } else {
                    RecipeCard(r, startExpanded = true) {
                        MarkActions(marks, vm::toggleMark)
                    }
                }
            }
            FilledTonalButton(onClick = vm::next, modifier = Modifier.fillMaxWidth()) {
                Icon(Icons.Filled.Casino, contentDescription = null)
                Text("یه غذای دیگه", modifier = Modifier.padding(start = 8.dp))
            }
        }
    }

    if (showAdd) {
        AddRecipeDialog(
            onDismiss = { showAdd = false },
            onSave = { t, i, s ->
                vm.addUserRecipe(t, i, s)
                showAdd = false
            },
        )
    }
}
