package com.kwancorp.mbti.ui.intro

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kwancorp.mbti.ui.model.Screen
import com.kwancorp.mbti.ui.theme.MbtiTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun IntroScreen(navController: NavController) {
    // TODO 임시 인트로화면
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "인트로",
            fontSize = 25.sp
        )
    }

    CoroutineScope(Dispatchers.Main).launch {
        delay(3_000)
        navController.navigate(Screen.Login.type.name)
    }
}

@Preview
@Composable
fun IntroScreenPreview() {
    MbtiTheme {
        // IntroScreen()
    }
}