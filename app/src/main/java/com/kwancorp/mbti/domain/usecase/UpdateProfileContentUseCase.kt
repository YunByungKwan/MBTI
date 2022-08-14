package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.ProfileRepository

/**
 * 프로필 정보를 업데이트한다
 */
class UpdateProfileContentUseCase(
    private val profileRepository: ProfileRepository
) {
    operator fun invoke() {}
}