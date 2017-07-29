package com.gutargu.api

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class MessageHandlerTest() {

    lateinit var messageHandler: MessageHandler
    lateinit var mockRepository: MessageRepository

    @Before
    fun setUp() {
        mockRepository = mock(MessageRepository::class.java)
        messageHandler = MessageHandler(mockRepository)
    }

    @Test fun testAllMessages() {
        `when`(mockRepository.all()).thenReturn(listOf(Message("id", "message", 1000)))

        assertEquals(listOf(Message("id", "message", 1000)), messageHandler.allMessages())
    }
}

