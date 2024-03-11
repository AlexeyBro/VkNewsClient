package com.sumin.vknewsclient.data.model.newsFeedDTO

import com.google.gson.annotations.SerializedName

data class LikesCountDto(
    @SerializedName("likes") val count: Int
)
