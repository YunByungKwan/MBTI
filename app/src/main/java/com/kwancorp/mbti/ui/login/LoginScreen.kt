package com.kwancorp.mbti.ui.login

import android.content.Context
import android.util.Log
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kakao.sdk.user.UserApiClient
import com.kwancorp.mbti.ui.theme.MbtiTheme

@Composable
fun LoginScreen(context: Context) {
    Button(
        onClick = { onClick(context) }
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterVertically),
            text = "카카오 로그인"
        )
    }
}

private fun onClick(context: Context) {
    UserApiClient.instance.loginWithKakaoTalk(context) { token, error ->
        if (error != null) {
            Log.d("TAG11", "로그인 실패", error)
        }
        else if (token != null) {
            Log.d("TAG11", "로그인 성공 ${token.accessToken}")
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    MbtiTheme {
        //LoginScreen()
    }
}