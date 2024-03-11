package com.sumin.vknewsclient.data.model.commentsDTO

import com.google.gson.annotations.SerializedName

data class CommentsContentDTO(
    @SerializedName("items") val comments: List<CommentDTO>,
    @SerializedName("profiles") val profiles: List<CommentsProfileDTO>
)
