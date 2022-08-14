package com.kwancorp.mbti.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kwancorp.mbti.ui.intro.IntroScreen
import com.kwancorp.mbti.ui.login.LoginScreen
import com.kwancorp.mbti.ui.model.Screen
import com.kwancorp.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    setupNavGraph(navController = navController)
                }
            }
        }
    }
}

@Composable
fun setupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Intro.type.name
    ) {
        composable(route = Screen.Intro.type.name) {
            IntroScreen(navController = navController)
        }

        composable(route = Screen.Login.type.name) {
            LoginScreen()
        }
    }
}