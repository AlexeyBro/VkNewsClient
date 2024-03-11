package com.sumin.vknewsclient.data.network

import com.sumin.vknewsclient.data.model.commentsDTO.CommentsResponseDTO
import com.sumin.vknewsclient.data.model.newsFeedDTO.LikesCountResponseDto
import com.sumin.vknewsclient.data.model.newsFeedDTO.NewsFeedResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("newsfeed.getRecommended?v=5.154")
    suspend fun loadRecommendations(
        @Query("access_token") token: String,
        @Query("count") count: Int
    ): NewsFeedResponseDto

    @GET("newsfeed.getRecommended?v=5.154")
    suspend fun loadRecommendations(
        @Query("access_token") token: String,
        @Query("start_from") startFrom: String,
        @Query("count") count: Int
    ): NewsFeedResponseDto

    @GET("likes.add?v=5.154&type=post")
    suspend fun addLike(
        @Query("access_token") token: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long
    ): LikesCountResponseDto

    @GET("likes.delete?v=5.154&type=post")
    suspend fun deleteLike(
        @Query("access_token") token: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long
    ): LikesCountResponseDto

    @GET("newsfeed.ignoreItem?v=5.154&type=wall")
    suspend fun deletePost(
        @Query("access_token") token: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long
    )

    @GET("wall.getComments?v=5.154&extended=1&fields=photo_100&count=10")
    suspend fun loadComments(
        @Query("access_token") token: String,
        @Query("owner_id") ownerId: Long,
        @Query("post_id") postId: Long
    ): CommentsResponseDTO
}
