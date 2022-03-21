package com.example.messagingstompwebsocket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@Suppress("RedundantModalityModifier")
@SpringBootApplication
open class MessagingStompWebsocketApplication

fun main(args: Array<String>) {
    runApplication<MessagingStompWebsocketApplication>(*args)
}
