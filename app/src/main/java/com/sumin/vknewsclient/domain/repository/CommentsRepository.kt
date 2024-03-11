package com.sumin.vknewsclient.domain.repository

import com.sumin.vknewsclient.domain.entity.FeedPost
import com.sumin.vknewsclient.domain.entity.PostComment
import kotlinx.coroutines.flow.StateFlow

interface CommentsRepository {

    fun loadComments(feedPost: FeedPost): StateFlow<List<PostComment>>
}