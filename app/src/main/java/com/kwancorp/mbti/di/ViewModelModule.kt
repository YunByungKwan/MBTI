package com.kwancorp.mbti.di

import com.kwancorp.mbti.ui.intro.IntroViewModel
import com.kwancorp.mbti.ui.login.LoginViewModel
import com.kwancorp.mbti.ui.post.PostViewModel
import com.kwancorp.mbti.ui.profile.ProfileViewModel
import com.kwancorp.mbti.ui.setting.SettingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { IntroViewModel() }
    viewModel { LoginViewModel() }
    viewModel { PostViewModel() }
    viewModel { ProfileViewModel() }
    viewModel { SettingViewModel() }
}