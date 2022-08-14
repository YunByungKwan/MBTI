package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.PostRepository

/**
 * 게시글을 업데이트한다
 */
class UpdatePostUseCase(
    private val postRepository: PostRepository
) {
    operator fun invoke() {}
}