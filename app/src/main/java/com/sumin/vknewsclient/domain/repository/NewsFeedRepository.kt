package com.sumin.vknewsclient.domain.repository

import com.sumin.vknewsclient.domain.entity.FeedPost
import dagger.Provides
import kotlinx.coroutines.flow.StateFlow

interface NewsFeedRepository {

    fun getRecommendations(): StateFlow<List<FeedPost>>

    suspend fun loadNextData()

    suspend fun changeLikeStatus(feedPost: FeedPost)

    suspend fun deletePost(feedPost: FeedPost)
}
