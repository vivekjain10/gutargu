package com.gutargu.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    @GetMapping("/messages")
    fun allMessages() = listOf(Message("some_id", "test message", 0))

}
