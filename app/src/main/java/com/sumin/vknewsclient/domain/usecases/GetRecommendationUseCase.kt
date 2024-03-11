package com.sumin.vknewsclient.domain.usecases

import com.sumin.vknewsclient.domain.entity.FeedPost
import com.sumin.vknewsclient.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetRecommendationUseCase @Inject constructor(
    val repository: NewsFeedRepository
) {

    operator fun invoke(): StateFlow<List<FeedPost>> {
        return repository.getRecommendations()
    }
}