package com.example.firebasepushnotifications

import java.io.Serializable

data class Todo(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)