package com.kwancorp.mbti.di

import org.koin.dsl.module

val appModule = module {
    viewModelModule
    useCaseModule
    repositoryModule
    dataSourceModule
}