package com.sumin.vknewsclient.data.mapper

import com.sumin.vknewsclient.data.model.commentsDTO.CommentsContentDTO
import com.sumin.vknewsclient.domain.entity.PostComment
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

class CommentsMapper @Inject constructor() {

    fun mapResponseToComments(response: CommentsContentDTO): List<PostComment> {
        val result = mutableListOf<PostComment>()
        val comments = response.comments
        val profiles = response.profiles

        for (comment in comments) {
            val profile = profiles.find { comment.fromId == it.id } ?: continue
            val postComment = PostComment(
                id = comment.id,
                authorName = "${profile.firstName} ${profile.lastName}",
                authorAvatarUrl = profile.imageUrl,
                commentText = comment.text,
                publicationDate = mapTimestampToDate(comment.date)
            )
            result.add(postComment)
        }
        return result
    }

    private fun mapTimestampToDate(timestamp: Long): String {
        val date = Date(timestamp * 1000)
        return SimpleDateFormat("d MMMM yyyy, hh:mm", Locale.getDefault()).format(date)
    }
}