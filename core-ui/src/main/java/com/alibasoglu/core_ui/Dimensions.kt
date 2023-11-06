package com.alibasoglu.core_ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val default: Dp = 0.dp,
    val spaceExtraSmall: Dp = 4.dp,
    val spaceSmall: Dp = 8.dp,
    val spaceMedium: Dp = 16.dp,
    val spaceLarger: Dp = 32.dp,
    val spaceExtraLarger: Dp = 64.dp
)


val LocalSpacing = compositionLocalOf {
    Dimensions()
}
