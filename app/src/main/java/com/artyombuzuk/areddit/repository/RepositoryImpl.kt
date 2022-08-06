package com.artyombuzuk.areddit.repository

import com.artyombuzuk.areddit.api.ApiFactory
import com.artyombuzuk.areddit.model.TopData

open class RepositoryImpl: Repository {

    private var remote = ApiFactory.apiService

    override suspend fun getTopData(after: String?): TopData {
        return remote.getTopPosts(after = after)
    }
}