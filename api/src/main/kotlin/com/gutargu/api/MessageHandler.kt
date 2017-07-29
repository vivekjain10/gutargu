package com.gutargu.api

class MessageHandler(val repository: MessageRepository) {

    fun allMessages() = repository.all()

}