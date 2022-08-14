package com.kwancorp.mbti.di

import com.kwancorp.mbti.data.source.LoginDataSource
import com.kwancorp.mbti.data.source.PostDataSource
import com.kwancorp.mbti.data.source.ProfileDataSource
import com.kwancorp.mbti.data.source.local.LoginLocalDataSource
import com.kwancorp.mbti.data.source.local.PostLocalDataSource
import com.kwancorp.mbti.data.source.local.ProfileLocalDataSource
import com.kwancorp.mbti.data.source.remote.LoginRemoteDataSource
import com.kwancorp.mbti.data.source.remote.PostRemoteDataSource
import com.kwancorp.mbti.data.source.remote.ProfileRemoteDataSource
import org.koin.dsl.module

val dataSourceModule = module {
    single<LoginDataSource> {
        LoginRemoteDataSource()
        LoginLocalDataSource()
    }
    single<PostDataSource> {
        PostRemoteDataSource()
        PostLocalDataSource()
    }
    single<ProfileDataSource> {
        ProfileRemoteDataSource()
        ProfileLocalDataSource()
    }
}