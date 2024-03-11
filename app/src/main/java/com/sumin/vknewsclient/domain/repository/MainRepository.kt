package com.sumin.vknewsclient.domain.repository

import com.sumin.vknewsclient.domain.entity.AuthState
import kotlinx.coroutines.flow.StateFlow

interface MainRepository {

    fun getAuthStateFlow(): StateFlow<AuthState>

    suspend fun checkAuthState()
}