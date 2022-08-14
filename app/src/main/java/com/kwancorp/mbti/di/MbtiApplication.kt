package com.kwancorp.mbti.di

import android.app.Application
import org.koin.core.context.startKoin

class MbtiApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(appModule)
        }
    }
}