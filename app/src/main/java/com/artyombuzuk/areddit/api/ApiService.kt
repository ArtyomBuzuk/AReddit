package com.artyombuzuk.areddit.api

import com.artyombuzuk.areddit.model.TopData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top.json")
    suspend fun getTopPosts(
        @Query(QUERY_PARAM_LIMIT) limit: Int = 25,
        @Query(QUERY_PARAM_AFTER) after: String? = null
    ): TopData


    companion object {
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_AFTER = "after"
    }
}