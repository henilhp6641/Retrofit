package com.example.firebasepushnotifications

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {
    @GET("/posts")
    suspend fun getTodos(): Response<List<Todo>>
}
