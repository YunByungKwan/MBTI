package com.kwancorp.mbti.ui.model

/**
 * 화면 상태
 */
sealed class Screen(val type: ScreenType) {
    object Intro : Screen(ScreenType.INTRO)
    object Login : Screen(ScreenType.LOGIN)
    object Main : Screen(ScreenType.MAIN)
}