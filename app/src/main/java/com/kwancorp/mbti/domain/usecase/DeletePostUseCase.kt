package com.kwancorp.mbti.domain.usecase

import com.kwancorp.mbti.domain.repository.PostRepository

/**
 * 게시글을 삭제한다
 */
class DeletePostUseCase(
    private val postRepository: PostRepository
) {
    operator fun invoke() {}
}