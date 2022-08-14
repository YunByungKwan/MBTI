package com.kwancorp.mbti.data.repository

import com.kwancorp.mbti.data.source.ProfileDataSource
import com.kwancorp.mbti.domain.repository.ProfileRepository

class ProfileRepositoryImpl(
    private val profileRemoteDataSource: ProfileDataSource,
    private val profileLocalDataSource: ProfileDataSource
) : ProfileRepository {
}