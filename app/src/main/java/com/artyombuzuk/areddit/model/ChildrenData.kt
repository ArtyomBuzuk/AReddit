package com.artyombuzuk.areddit.model

import com.google.gson.annotations.SerializedName

data class ChildrenData(
    @SerializedName("children")
    val postModelData: List<PostModelData>,

    @SerializedName("after")
    val after: String?
)