package com.sumin.vknewsclient.data.model.commentsDTO

import com.google.gson.annotations.SerializedName

data class CommentDTO(
    @SerializedName("id") val id: Long,
    @SerializedName("from_id") val fromId: Long,
    @SerializedName("date") val date: Long,
    @SerializedName("text") val text: String
)
