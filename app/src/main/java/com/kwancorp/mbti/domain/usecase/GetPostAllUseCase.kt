package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.PostRepository

/**
 * 모든 게시글을 가져온다
 */
class GetPostAllUseCase(
    private val postRepository: PostRepository
) {
    operator fun invoke() {}
}