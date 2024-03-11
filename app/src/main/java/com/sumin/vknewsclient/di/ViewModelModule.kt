package com.sumin.vknewsclient.di

import androidx.lifecycle.ViewModel
import com.sumin.vknewsclient.presentation.comments.CommentsViewModel
import com.sumin.vknewsclient.presentation.main.MainViewModel
import com.sumin.vknewsclient.presentation.news.NewsFeedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(NewsFeedViewModel::class)
    @Binds
    fun bindsNewsFeedViewModel(viewModel: NewsFeedViewModel): ViewModel

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindsMainViewModel(viewModel: MainViewModel): ViewModel
}