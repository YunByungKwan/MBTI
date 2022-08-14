package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.ProfileRepository

/**
 * 프로필 사진을 업데이트한다
 */
class UpdateProfileImageUseCase(
    private val profileRepository: ProfileRepository
) {
    operator fun invoke() {}
}