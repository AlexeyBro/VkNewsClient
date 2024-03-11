package com.sumin.vknewsclient.di

import android.content.Context
import com.sumin.vknewsclient.data.network.ApiFactory
import com.sumin.vknewsclient.data.network.ApiService
import com.sumin.vknewsclient.data.repository.CommentsRepositoryImpl
import com.sumin.vknewsclient.data.repository.MainRepositoryImpl
import com.sumin.vknewsclient.data.repository.NewsFeedRepositoryImpl
import com.sumin.vknewsclient.domain.repository.CommentsRepository
import com.sumin.vknewsclient.domain.repository.MainRepository
import com.sumin.vknewsclient.domain.repository.NewsFeedRepository
import com.vk.api.sdk.VKPreferencesKeyValueStorage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindNewsFeedRepository(impl: NewsFeedRepositoryImpl): NewsFeedRepository

    @ApplicationScope
    @Binds
    fun bindMainRepository(impl: MainRepositoryImpl): MainRepository

    @ApplicationScope
    @Binds
    fun bindCommentsRepository(impl: CommentsRepositoryImpl): CommentsRepository

    companion object {
        @ApplicationScope
        @Provides
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }

        @ApplicationScope
        @Provides
        fun provideVKStorage(context: Context): VKPreferencesKeyValueStorage {
            return VKPreferencesKeyValueStorage(context)
        }
    }
}