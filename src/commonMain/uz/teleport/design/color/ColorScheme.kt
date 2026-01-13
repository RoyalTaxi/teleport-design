package uz.teleport.core.presentation.design.color

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

class ColorScheme(
    brandGreen: Color,
    brandYellow: Color,

    textLight: Color,
    textDark: Color,
    textDisable: Color,

    uiSurface: Color,
    uiSurfaceSubtle: Color,
    uiDark: Color,
    uiIconMuted: Color,
    uiBorder: Color
) {
    val brandGreen by mutableStateOf(brandGreen, structuralEqualityPolicy())
    val brandYellow by mutableStateOf(brandYellow, structuralEqualityPolicy())

    val textLight by mutableStateOf(textLight, structuralEqualityPolicy())
    val textDark by mutableStateOf(textDark, structuralEqualityPolicy())
    val textDisable by mutableStateOf(textDisable, structuralEqualityPolicy())

    val uiSurface by mutableStateOf(uiSurface, structuralEqualityPolicy())
    val uiSurfaceSubtle by mutableStateOf(uiSurfaceSubtle, structuralEqualityPolicy())
    val uiDark by mutableStateOf(uiDark, structuralEqualityPolicy())
    val uiIconMuted by mutableStateOf(uiIconMuted, structuralEqualityPolicy())
    val uiBorder by mutableStateOf(uiBorder, structuralEqualityPolicy())
}

fun light(
    brandGreen: Color = BrandGreen,
    brandYellow: Color = BrandYellow,

    textLight: Color = TextLight,
    textDark: Color = TextDark,
    textDisable: Color = TextDisable,

    uiSurface: Color = UiSurface,
    uiSurfaceSubtle: Color = UiSurfaceSubtle,
    uiDark: Color = UiDark,
    uiIconMuted: Color = UiIconMuted,
    uiBorder: Color = UiBorder
) = ColorScheme(
    brandGreen = brandGreen,
    brandYellow = brandYellow,

    textLight = textLight,
    textDark = textDark,
    textDisable = textDisable,

    uiSurface = uiSurface,
    uiSurfaceSubtle = uiSurfaceSubtle,
    uiDark = uiDark,
    uiIconMuted = uiIconMuted,
    uiBorder = uiBorder
)

val LocalCustomColorScheme = staticCompositionLocalOf { light() }