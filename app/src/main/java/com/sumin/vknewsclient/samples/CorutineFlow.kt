package com.sumin.vknewsclient.samples

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

//suspend fun main() {
//    getNumbersFlow().collect {
//        println("Number: $it")
//    }
//}
//
//fun getNumbersFlow(): Flow<Int> {
//    val numbers = listOf(43, 50, 12, 7)
//    return flow {
//        numbers.forEach {
//            println("Emited: $it")
//            delay(100)
//            emit(it)
//        }
//    }
//}