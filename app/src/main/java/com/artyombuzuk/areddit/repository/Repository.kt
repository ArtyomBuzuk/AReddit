package com.artyombuzuk.areddit.repository

import com.artyombuzuk.areddit.model.TopData

interface Repository {

    suspend fun getTopData(after: String?): TopData

}