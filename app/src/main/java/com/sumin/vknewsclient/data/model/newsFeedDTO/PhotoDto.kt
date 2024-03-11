package com.sumin.vknewsclient.data.model.newsFeedDTO

import com.google.gson.annotations.SerializedName

data class PhotoDto(
    @SerializedName("sizes") val photoUrls: List<PhotoUrlDto>
)
