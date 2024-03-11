package com.sumin.vknewsclient.domain.usecases

import com.sumin.vknewsclient.domain.entity.AuthState
import com.sumin.vknewsclient.domain.entity.FeedPost
import com.sumin.vknewsclient.domain.entity.PostComment
import com.sumin.vknewsclient.domain.repository.CommentsRepository
import com.sumin.vknewsclient.domain.repository.MainRepository
import com.sumin.vknewsclient.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class LoadNextDataUseCase @Inject constructor(
    val repository: NewsFeedRepository
) {

    suspend operator fun invoke() {
        repository.loadNextData()
    }
}