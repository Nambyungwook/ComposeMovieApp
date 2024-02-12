package kr.co.nbw.composemovieapp.ui.config

import kr.co.nbw.composemovieapp.ui.theme.Shapes
import kr.co.nbw.composemovieapp.ui.theme.Typography
import kr.co.nbw.composemovieapp.ui.theme.color.ColorSet

object DefaultComponentConfig {
    val RED_THEME = ComponentConfig(
        colors = ColorSet.Red,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )

    val BLUE_THEME = ComponentConfig(
        colors = ColorSet.Blue,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )
}