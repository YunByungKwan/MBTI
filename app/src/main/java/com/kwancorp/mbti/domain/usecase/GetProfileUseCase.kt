package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.ProfileRepository

/**
 * 프로필 정보를 가져온다
 */
class GetProfileUseCase(
    private val profileRepository: ProfileRepository
) {
    operator fun invoke() {}
}