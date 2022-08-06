package com.artyombuzuk.areddit.model

import com.google.gson.annotations.SerializedName

data class PostModelData(
    @SerializedName("data")
    val postModel: PostModel
)
