package com.kwancorp.mbti.di

import com.kwancorp.mbti.data.repository.LoginRepositoryImpl
import com.kwancorp.mbti.data.repository.PostRepositoryImpl
import com.kwancorp.mbti.data.repository.ProfileRepositoryImpl
import com.kwancorp.mbti.domain.repository.LoginRepository
import com.kwancorp.mbti.domain.repository.PostRepository
import com.kwancorp.mbti.domain.repository.ProfileRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<LoginRepository> {
        LoginRepositoryImpl(
            loginRemoteDataSource = get(),
            loginLocalDataSource = get()
        )
    }

    single<PostRepository> {
        PostRepositoryImpl(
            postRemoteDataSource = get(),
            postLocalDataSource = get()
        )
    }

    single<ProfileRepository> {
        ProfileRepositoryImpl(
            profileRemoteDataSource = get(),
            profileLocalDataSource = get()
        )
    }
}