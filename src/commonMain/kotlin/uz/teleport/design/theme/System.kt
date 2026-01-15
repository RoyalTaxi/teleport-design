package uz.teleport.design.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import uz.teleport.design.color.ColorScheme
import uz.teleport.design.color.LocalCustomColorScheme
import uz.teleport.design.type.LocalCustomTypography
import uz.teleport.design.type.TypeScheme
import uz.teleport.design.type.rememberTypeScheme

object System {
    val color: ColorScheme
        @Composable
        get() = LocalCustomColorScheme.current

    val type: TypeScheme
        @Composable
        get() = rememberTypeScheme()
}

@Composable
fun TeleportCustomTheme(
    color: ColorScheme,
    typography: TypeScheme,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalCustomColorScheme provides color,
        LocalCustomTypography provides typography
    ) {
        content()
    }
}