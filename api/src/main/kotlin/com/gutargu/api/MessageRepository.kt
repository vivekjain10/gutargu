package com.gutargu.api

class MessageRepository {
    fun all() = listOf(Message("some_id", "test message", 0))
}