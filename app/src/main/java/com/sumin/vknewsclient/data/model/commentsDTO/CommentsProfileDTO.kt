package com.sumin.vknewsclient.data.model.commentsDTO

import com.google.gson.annotations.SerializedName

class CommentsProfileDTO(
    @SerializedName("id") val id: Long,
    @SerializedName("photo_100") val imageUrl: String,
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String
)