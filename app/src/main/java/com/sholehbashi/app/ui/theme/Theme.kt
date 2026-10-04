package com.sholehbashi.app.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.graphics.Color

// Warm "kitchen" palette
val Ember = Color(0xFFE8590C)
val Saffron = Color(0xFFF2A33A)
val Cream = Color(0xFFFFF4E6)
val Peach = Color(0xFFFFE0C2)
val Walnut = Color(0xFF4A2C1A)
val Olive = Color(0xFF6B7F3A)

private val LightColors: ColorScheme = lightColorScheme(
    primary = Ember,
    onPrimary = Color.White,
    secondary = Olive,
    tertiary = Saffron,
    background = Cream,
    onBackground = Walnut,
    surface = Color(0xFFFFFBF5),
    onSurface = Walnut,
    primaryContainer = Peach,
    onPrimaryContainer = Walnut,
)

private val DarkColors: ColorScheme = darkColorScheme(
    primary = Saffron,
    onPrimary = Color(0xFF3A1D00),
    secondary = Color(0xFFB5C77A),
    tertiary = Ember,
    background = Color(0xFF1E130B),
    onBackground = Color(0xFFFFE9D2),
    surface = Color(0xFF2A1B10),
    onSurface = Color(0xFFFFE9D2),
    primaryContainer = Color(0xFF5A3418),
    onPrimaryContainer = Color(0xFFFFE9D2),
)

@Composable
fun SholehBashiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        // TODO: add a Persian font (e.g. Vazirmatn in res/font) and set it in Typography
        content = content,
    )
}
