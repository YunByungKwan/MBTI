package com.kwancorp.mbti.data.repository

import com.kwancorp.mbti.data.source.PostDataSource
import com.kwancorp.mbti.domain.repository.PostRepository

class PostRepositoryImpl(
    private val postRemoteDataSource: PostDataSource,
    private val postLocalDataSource: PostDataSource
) : PostRepository {
}