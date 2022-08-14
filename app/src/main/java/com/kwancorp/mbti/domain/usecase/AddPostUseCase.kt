package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.PostRepository

/**
 * 게시글을 작성한다
 */
class AddPostUseCase(
    private val postRepository: PostRepository
) {
    operator fun invoke() {}
}