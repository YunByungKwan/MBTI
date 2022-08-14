package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.PostRepository

/**
 * 게시글을 가져온다
 */
class GetPostUseCase(
    private val postRepository: PostRepository
) {
    operator fun invoke() {}
}