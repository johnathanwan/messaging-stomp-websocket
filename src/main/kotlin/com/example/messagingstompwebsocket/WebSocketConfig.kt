package com.example.messagingstompwebsocket

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.config.*
import org.springframework.web.socket.config.annotation.*

@Suppress("RedundantModalityModifier")
@Configuration
@EnableWebSocketMessageBroker
open class WebSocketConfig : WebSocketMessageBrokerConfigurer {

    override fun configureMessageBroker(registry: MessageBrokerRegistry) {
        registry.enableSimpleBroker("/topic")
        registry.setApplicationDestinationPrefixes("/app")
    }

    override fun registerStompEndpoints(registry: StompEndpointRegistry) {
        registry.addEndpoint("/gs-guide-websocket").withSockJS()
    }
}