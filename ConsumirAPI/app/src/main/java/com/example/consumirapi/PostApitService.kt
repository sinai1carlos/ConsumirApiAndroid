package com.example.consumirapi

import retrofit2.http.GET

interface PostApitService {
    @GET("posts")
    suspend fun getUserPost():ArrayList<PostModel>
}