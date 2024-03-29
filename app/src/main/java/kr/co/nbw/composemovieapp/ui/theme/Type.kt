package kr.co.nbw.composemovieapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import kr.co.nbw.composemovieapp.R

private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp,
    ), // h1
    displayMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
    ), // h2
    displaySmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp
    ), // h3
    headlineMedium = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 32.sp
    ), // h4
    headlineSmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp
    ), // h5
    labelLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ), // button
    titleLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp
    ), // h6
    titleMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ), // subtitle1
    titleSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ), // subtitle2
    bodyLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp
    ), // body1
    bodyMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ), // body2
    bodySmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ) // caption
)

val Typography.h5Title: TextStyle
    @Composable get() = headlineSmall.copy(
        fontSize = 24.sp
    )

val Typography.dialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        fontSize = 18.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )