package com.sholehbashi.app.ui.newmeal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sholehbashi.app.R
import com.sholehbashi.app.data.GOALS
import com.sholehbashi.app.data.MEAL_TYPES
import com.sholehbashi.app.data.PrefType
import com.sholehbashi.app.data.REGIONS
import com.sholehbashi.app.data.Source
import com.sholehbashi.app.data.db.RecipeEntity
import com.sholehbashi.app.data.db.UserPrefEntity
import com.sholehbashi.app.ui.common.CenteredColumn
import com.sholehbashi.app.ui.common.MarkActions
import com.sholehbashi.app.ui.common.RecipeCard
import com.sholehbashi.app.ui.common.ScreenScaffold
import com.sholehbashi.app.util.appViewModel
import androidx.compose.ui.res.stringResource

@Composable
fun NewMealScreen(onBack: () -> Unit) {
    val vm = appViewModel { NewMealViewModel(it) }
    val ui by vm.ui.collectAsStateWithLifecycle()
    val saved by vm.saved.collectAsStateWithLifecycle()

    @Composable
    fun Section(title: String, hint: String, type: String) {
        PrefSection(
            title = title,
            hint = hint,
            selected = ui.selected[type].orEmpty(),
            saved = saved.filter { it.type == type },
            onAdd = { vm.addPref(type, it) },
            onSelect = { vm.select(type, it) },
            onUnselect = { vm.unselect(type, it) },
            onDeleteSaved = vm::deleteSaved,
        )
    }

    ScreenScaffold(title = stringResource(R.string.menu_new), onBack = onBack) { padding ->
        CenteredColumn(padding) {
            // 1) must-have ingredients   2) must-avoid ingredients
            Section("حتماً داشته باشه", "مثلاً برنج", PrefType.WANT)
            Section("نخوام داشته باشه", "مثلاً خیار", PrefType.AVOID)

            // 3) important elements: goal, allergies, special diet
            Text("المان‌های مهم", style = MaterialTheme.typography.titleMedium)
            ChoiceRow(GOALS, ui.goal, vm::setGoal)
            Section("حساسیت‌ها", "مثلاً بادام‌زمینی", PrefType.ALLERGY)
            Section("رژیم خاص", "مثلاً کتو، گیاه‌خواری", PrefType.DIET)

            // 4) free-text wish
            OutlinedTextField(
                value = ui.wish,
                onValueChange = vm::setWish,
                modifier = Modifier.fillMaxWidth(),
                label = { Text("دلت چی می‌خواد؟") },
                placeholder = { Text("توضیح تکمیلی، مثلاً یه چیز سریع و تند") },
                minLines = 2,
            )

            // 5) meal type   6) region
            Text("وعده", style = MaterialTheme.typography.titleMedium)
            ChoiceRow(MEAL_TYPES, ui.mealType, vm::setMealType)
            Text("کشور / منطقه", style = MaterialTheme.typography.titleMedium)
            ChoiceRow(REGIONS, ui.region, vm::setRegion)

            Button(onClick = vm::generate, enabled = !ui.loading, modifier = Modifier.fillMaxWidth()) {
                if (ui.loading) {
                    CircularProgressIndicator(Modifier.size(20.dp), strokeWidth = 2.dp, color = MaterialTheme.colorScheme.onPrimary)
                } else {
                    Icon(Icons.Filled.AutoAwesome, contentDescription = null)
                }
                Text("سه تا غذا پیشنهاد بده", modifier = Modifier.padding(start = 8.dp))
            }

            ui.error?.let { Text(it, color = MaterialTheme.colorScheme.error) }

            ui.results.forEachIndexed { index, result ->
                RecipeCard(
                    recipe = RecipeEntity(
                        id = result.recipeId ?: 0,
                        title = result.dto.title,
                        ingredients = result.dto.ingredients,
                        instructions = result.dto.instructions,
                        source = Source.AI,
                    ),
                ) {
                    MarkActions(result.marks) { vm.toggleMark(index, it) }
                    Spacer(Modifier.weight(1f))
                    FilledTonalButton(onClick = { vm.confirm(index) }, enabled = !result.confirmed) {
                        Icon(Icons.Filled.Check, contentDescription = null)
                        Text(if (result.confirmed) "ثبت شد" else "می‌پزمش", modifier = Modifier.padding(start = 6.dp))
                    }
                }
            }
        }
    }
}

/**
 * One preference block:
 *  - text field to add a new value (saved to the DB and selected right away)
 *  - selected values (tap to unselect)
 *  - previously saved values as suggestions (tap = select, X = delete from the DB)
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun PrefSection(
    title: String,
    hint: String,
    selected: Set<String>,
    saved: List<UserPrefEntity>,
    onAdd: (String) -> Unit,
    onSelect: (String) -> Unit,
    onUnselect: (String) -> Unit,
    onDeleteSaved: (UserPrefEntity) -> Unit,
) {
    var text by rememberSaveable(title) { mutableStateOf("") }
    val suggestions = saved.filter { it.value !in selected }

    Card(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Row(verticalAlignment = Alignment.CenterVertically) {
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    modifier = Modifier.weight(1f),
                    placeholder = { Text(hint) },
                    singleLine = true,
                )
                Spacer(Modifier.width(8.dp))
                FilledIconButton(
                    onClick = {
                        onAdd(text)
                        text = ""
                    },
                    enabled = text.isNotBlank(),
                ) { Icon(Icons.Filled.Add, contentDescription = "افزودن") }
            }
            if (selected.isNotEmpty()) {
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    selected.forEach { value ->
                        InputChip(
                            selected = true,
                            onClick = { onUnselect(value) },
                            label = { Text(value) },
                            trailingIcon = {
                                Icon(Icons.Filled.Close, contentDescription = "برداشتن", modifier = Modifier.size(InputChipDefaults.IconSize))
                            },
                        )
                    }
                }
            }
            if (suggestions.isNotEmpty()) {
                Text(
                    "پیشنهادها: بزن تا اضافه بشه، ✕ برای حذف همیشگی",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                )
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    suggestions.forEach { pref ->
                        InputChip(
                            selected = false,
                            onClick = { onSelect(pref.value) },
                            label = { Text(pref.value) },
                            trailingIcon = {
                                Icon(
                                    Icons.Filled.Close,
                                    contentDescription = "حذف از پیشنهادها",
                                    modifier = Modifier
                                        .size(InputChipDefaults.IconSize)
                                        .clickable { onDeleteSaved(pref) },
                                )
                            },
                        )
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ChoiceRow(options: List<Pair<String, String>>, selected: String, onSelect: (String) -> Unit) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        options.forEach { (key, label) ->
            FilterChip(
                selected = key == selected,
                onClick = { onSelect(key) },
                label = { Text(label) },
            )
        }
    }
}
