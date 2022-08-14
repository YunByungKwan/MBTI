package com.kwancorp.mbti.di

import android.app.Application
import com.kakao.sdk.common.KakaoSdk
import com.kwancorp.mbti.BuildConfig
import org.koin.core.context.startKoin

class MbtiApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Kakao SDK 초기화
        KakaoSdk.init(this, BuildConfig.KAKAO_NATIVE_APP_KEY)

        startKoin {
            modules(appModule)
        }
    }
}