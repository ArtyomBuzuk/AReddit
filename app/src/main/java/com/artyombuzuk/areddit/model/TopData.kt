package com.artyombuzuk.areddit.model

import com.google.gson.annotations.SerializedName

data class TopData(
    @SerializedName("data")
    val childrenData: ChildrenData
)