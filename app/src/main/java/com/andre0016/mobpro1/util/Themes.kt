package com.andre0016.mobpro1.util

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

fun getCustomColorScheme(colorName: String, isDarkTheme: Boolean): ColorScheme {
    return when (colorName) {
        "Red" -> if (isDarkTheme) darkColorScheme(primary = Color(0xFFFFB6C1)) else lightColorScheme(primary = Color(0xFFFFB6C1)) // Light Pink Pastel
        "Blue" -> if (isDarkTheme) darkColorScheme(primary = Color(0xFFADD8E6)) else lightColorScheme(primary = Color(0xFFADD8E6)) // Light Blue Pastel
        "Green" -> if (isDarkTheme) darkColorScheme(primary = Color(0xFF98FB98)) else lightColorScheme(primary = Color(0xFF98FB98)) // Pale Green Pastel
        "Yellow" -> if (isDarkTheme) darkColorScheme(primary = Color(0xFFFFE4B5)) else lightColorScheme(primary = Color(0xFFFFE4B5)) // Moccasin Pastel Yellow
        else -> if (isDarkTheme) darkColorScheme() else lightColorScheme()

    }
}
