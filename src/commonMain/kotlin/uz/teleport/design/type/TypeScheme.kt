package uz.teleport.design.type

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

data class TypeScheme(
    val display: TextStyle,
    val h1: TextStyle,
    val h2: TextStyle,
    val body: TextStyle,
    val bodySemiBold: TextStyle,
    val button: TextStyle,
    val caption: TextStyle,
    val small: TextStyle,
)

val LocalCustomTypography = staticCompositionLocalOf<TypeScheme> { error("No FontScheme provided") }