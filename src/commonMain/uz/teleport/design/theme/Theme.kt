package uz.teleport.core.presentation.design.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import uz.teleport.core.presentation.design.color.light
import uz.teleport.core.presentation.design.type.rememberTypeScheme

@Composable
fun Theme(
    content: @Composable () -> Unit
) {
    TeleportCustomTheme(
        color = light(),
        typography = rememberTypeScheme()
    ) {
        MaterialTheme(
            content = content
        )
    }
}