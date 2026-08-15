package com.johnev.lob.ui.theme

import android.hardware.lights.Light
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

//private val Ink = Color(0xFF1D2621)
//private val Moss = Color(0xFF3A6B4A)
//private val Paper = Color(0xFFF7F7F2)
//private val SoftGreen = Color(0xFFDCE9DD)

private val LightColors = lightColorScheme(
//    primary = Moss,
//    onPrimary = Color.White,
//    primaryContainer = SoftGreen,
//    onPrimaryContainer = Ink,
//    background = Paper,
//    onBackground = Ink,
//    surface = Paper,
//    onSurface = Ink,
)

private val DarkColors = darkColorScheme()

@Composable
fun BroccoliTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) DarkColors else LightColors,
        content = content,
    )
}