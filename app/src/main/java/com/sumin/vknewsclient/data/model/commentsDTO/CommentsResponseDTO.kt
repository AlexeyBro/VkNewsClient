package com.sumin.vknewsclient.data.model.commentsDTO

import com.google.gson.annotations.SerializedName

data class CommentsResponseDTO(
    @SerializedName("response") val response: CommentsContentDTO
)