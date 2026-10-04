package com.sholehbashi.app.ui.common

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.WatchLater
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.WatchLater
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sholehbashi.app.data.MarkType
import com.sholehbashi.app.data.db.RecipeEntity
import com.sholehbashi.app.ui.theme.Cream
import com.sholehbashi.app.ui.theme.Peach

/** Warm gradient background + top bar with back button, shared by all inner screens. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenScaffold(
    title: String,
    onBack: () -> Unit,
    floatingActionButton: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit,
) {
    val colors = MaterialTheme.colorScheme
    Box(
        Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(colors.background, colors.primaryContainer.copy(alpha = 0.55f))))
    ) {
        Scaffold(
            containerColor = Color.Transparent,
            topBar = {
                TopAppBar(
                    title = { Text(title) },
                    navigationIcon = {
                        IconButton(onClick = onBack) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "بازگشت")
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent),
                )
            },
            floatingActionButton = floatingActionButton,
            content = content,
        )
    }
}

/** Centers content and caps its width so layouts stay nice on tablets and foldables. */
@Composable
fun CenteredColumn(
    padding: PaddingValues,
    scrollable: Boolean = true,
    content: @Composable () -> Unit,
) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(padding),
        contentAlignment = Alignment.TopCenter,
    ) {
        Column(
            Modifier
                .widthIn(max = 640.dp)
                .fillMaxWidth()
                .then(if (scrollable) Modifier.verticalScroll(rememberScrollState()) else Modifier)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            content()
            Spacer(Modifier.height(80.dp))
        }
    }
}

/** Expandable recipe card (tap to show ingredients and instructions). */
@Composable
fun RecipeCard(
    recipe: RecipeEntity,
    modifier: Modifier = Modifier,
    startExpanded: Boolean = false,
    actions: @Composable RowScope.() -> Unit = {},
) {
    var expanded by rememberSaveable(recipe.id, recipe.title) { mutableStateOf(startExpanded) }
    ElevatedCard(modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text(
                recipe.title,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded },
            )
            AnimatedVisibility(expanded) {
                Column(Modifier.padding(top = 12.dp)) {
                    Text("مواد لازم", style = MaterialTheme.typography.titleSmall, color = MaterialTheme.colorScheme.primary)
                    Text(recipe.ingredients, style = MaterialTheme.typography.bodyMedium)
                    Spacer(Modifier.height(10.dp))
                    Text("طرز تهیه", style = MaterialTheme.typography.titleSmall, color = MaterialTheme.colorScheme.primary)
                    Text(recipe.instructions, style = MaterialTheme.typography.bodyMedium)
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                content = actions,
            )
        }
    }
}

/** Favorite + "cook later" toggle buttons. */
@Composable
fun RowScope.MarkActions(marks: Collection<String>, onToggle: (String) -> Unit) {
    val fav = MarkType.FAVORITE in marks
    val later = MarkType.COOK_LATER in marks
    IconToggleButton(checked = fav, onCheckedChange = { onToggle(MarkType.FAVORITE) }) {
        Icon(
            if (fav) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
            contentDescription = "محبوب",
            tint = if (fav) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
        )
    }
    IconToggleButton(checked = later, onCheckedChange = { onToggle(MarkType.COOK_LATER) }) {
        Icon(
            if (later) Icons.Filled.WatchLater else Icons.Outlined.WatchLater,
            contentDescription = "برای پختن در آینده",
            tint = if (later) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
        )
    }
}

@Composable
fun AddRecipeDialog(onDismiss: () -> Unit, onSave: (title: String, ingredients: String, instructions: String) -> Unit) {
    var title by remember { mutableStateOf("") }
    var ingredients by remember { mutableStateOf("") }
    var instructions by remember { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("افزودن غذای خودم") },
        text = {
            Column(
                Modifier.verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                OutlinedTextField(title, { title = it }, label = { Text("نام غذا") }, singleLine = true)
                OutlinedTextField(ingredients, { ingredients = it }, label = { Text("مواد لازم") }, minLines = 2)
                OutlinedTextField(instructions, { instructions = it }, label = { Text("طرز تهیه") }, minLines = 3)
            }
        },
        confirmButton = {
            TextButton(
                onClick = { onSave(title.trim(), ingredients.trim(), instructions.trim()) },
                enabled = title.isNotBlank(),
            ) { Text("ذخیره") }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("انصراف") } },
    )
}
