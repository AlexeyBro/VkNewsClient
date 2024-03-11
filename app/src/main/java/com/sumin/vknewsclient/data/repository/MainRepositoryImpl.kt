package com.sumin.vknewsclient.data.repository

import android.app.Application
import com.sumin.vknewsclient.domain.entity.AuthState
import com.sumin.vknewsclient.domain.repository.MainRepository
import com.vk.api.sdk.VKPreferencesKeyValueStorage
import com.vk.api.sdk.auth.VKAccessToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val storage: VKPreferencesKeyValueStorage
): MainRepository {

    private val coroutineScope = CoroutineScope(Dispatchers.Default)
    private val checkAuthStateEvents = MutableSharedFlow<Unit>(replay = 1)

    private val authStateFlow: StateFlow<AuthState> = flow {
        checkAuthStateEvents.emit(Unit)
        checkAuthStateEvents.collect {
            val token = VKAccessToken.restore(storage)
            val loggedIn = token != null && token.isValid

            if (loggedIn) {
                emit(AuthState.Authorized)
            } else {
                emit(AuthState.NotAuthorized)
            }
        }
    }.stateIn(
        scope = coroutineScope,
        started = SharingStarted.Lazily,
        initialValue = AuthState.Initial
    )

    override fun getAuthStateFlow(): StateFlow<AuthState> = authStateFlow

    override suspend fun checkAuthState() {
        checkAuthStateEvents.emit(Unit)
    }
}