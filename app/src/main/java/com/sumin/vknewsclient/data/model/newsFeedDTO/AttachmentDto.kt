package com.sumin.vknewsclient.data.model.newsFeedDTO

import com.google.gson.annotations.SerializedName

data class AttachmentDto(
    @SerializedName("photo") val photo: PhotoDto?
)
