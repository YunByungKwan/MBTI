package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.ProfileRepository

/**
 * 프로필 사진을 업로드한다
 */
class AddProfileImageUseCase(
    private val profileRepository: ProfileRepository
) {
    operator fun invoke() {}
}