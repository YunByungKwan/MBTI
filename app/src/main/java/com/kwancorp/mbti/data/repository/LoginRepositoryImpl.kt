package com.kwancorp.mbti.data.repository

import com.kwancorp.mbti.data.source.LoginDataSource
import com.kwancorp.mbti.domain.repository.LoginRepository

class LoginRepositoryImpl(
    private val loginRemoteDataSource: LoginDataSource,
    private val loginLocalDataSource: LoginDataSource
) : LoginRepository {

}