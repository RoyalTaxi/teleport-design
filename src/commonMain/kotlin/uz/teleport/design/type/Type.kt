package uz.teleport.design.type

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import uz.teleport.resources.Res
import uz.teleport.resources.inter_bold
import uz.teleport.resources.inter_medium
import uz.teleport.resources.inter_regular
import uz.teleport.resources.inter_semi_bold

@Composable
fun rememberTypeScheme() : TypeScheme {
    return TypeScheme(
        display = TextStyle(
            fontSize = 32.sp,
            lineHeight = 40.sp,
            fontFamily = FontFamily(Font(Res.font.inter_bold))
        ),
        h1 = TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontFamily = FontFamily(Font(Res.font.inter_bold))
        ),
        h2 = TextStyle(
            fontSize = 20.sp,
            lineHeight = 28.sp,
            fontFamily = FontFamily(Font(Res.font.inter_semi_bold))
        ),
        body = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontFamily = FontFamily(Font(Res.font.inter_regular))
        ),
        bodySemiBold = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontFamily = FontFamily(Font(Res.font.inter_semi_bold))
        ),
        button = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontFamily = FontFamily(Font(Res.font.inter_semi_bold))
        ),
        caption = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontFamily = FontFamily(Font(Res.font.inter_medium))
        ),
        small = TextStyle(
            fontSize = 10.sp,
            lineHeight = 10.sp,
            fontFamily = FontFamily(Font(Res.font.inter_regular))
        )
    )
}