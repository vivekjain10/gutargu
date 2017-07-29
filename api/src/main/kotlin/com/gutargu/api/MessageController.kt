package com.gutargu.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    val handler = MessageHandler(MessageRepository())

    @GetMapping("/messages")
    fun allMessages() = handler.allMessages()

}
