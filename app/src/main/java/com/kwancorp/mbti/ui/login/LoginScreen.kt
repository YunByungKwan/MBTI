package com.kwancorp.mbti.ui.login

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kwancorp.mbti.ui.theme.MbtiTheme

@Composable
fun LoginScreen() {
    // TODO
    Button(
        onClick = { /*TODO*/ }
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterVertically),
            text = "카카오 로그인"
        )
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    MbtiTheme {
        LoginScreen()
    }
}