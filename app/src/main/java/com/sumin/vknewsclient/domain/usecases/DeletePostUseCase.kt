package com.sumin.vknewsclient.domain.usecases

import com.sumin.vknewsclient.domain.entity.FeedPost
import com.sumin.vknewsclient.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class DeletePostUseCase @Inject constructor(
    val repository: NewsFeedRepository
) {

    suspend operator fun invoke(feedPost: FeedPost) {
        repository.deletePost(feedPost)
    }
}