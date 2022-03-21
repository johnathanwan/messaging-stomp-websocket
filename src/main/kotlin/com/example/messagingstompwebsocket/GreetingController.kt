package com.example.messagingstompwebsocket

import kotlinx.coroutines.*
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils

@Controller
class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    fun greeting(message: HelloMessage): Greeting {
        runBlocking {
            delay(1000)
        }
        return Greeting("Hello, ${HtmlUtils.htmlEscape(message.name!!)}!")
    }
}