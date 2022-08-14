package com.kwancorp.mbti.di

import com.kwancorp.mbti.domain.usecase.*
import org.koin.dsl.module

val useCaseModule = module {
    factory { AddPostUseCase(postRepository = get()) }
    factory { AddProfileImageUseCase(profileRepository = get()) }
    factory { DeletePostUseCase(postRepository = get()) }
    factory { GetPostAllUseCase(postRepository = get()) }
    factory { GetPostUseCase(postRepository = get()) }
    factory { GetProfileUseCase(profileRepository = get()) }
    factory { UpdatePostUseCase(postRepository = get()) }
    factory { UpdateProfileContentUseCase(profileRepository = get()) }
    factory { UpdateProfileImageUseCase(profileRepository = get()) }
}