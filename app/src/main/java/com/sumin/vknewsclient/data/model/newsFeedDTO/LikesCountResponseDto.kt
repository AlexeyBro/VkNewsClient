package com.sumin.vknewsclient.data.model.newsFeedDTO

import com.google.gson.annotations.SerializedName

data class LikesCountResponseDto(
    @SerializedName("response") val likes: LikesCountDto
)
