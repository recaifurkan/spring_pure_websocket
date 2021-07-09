package com.rfbsoft.config;

import com.rfbsoft.websocket.BinarySocketHandler;
import com.rfbsoft.websocket.ProtocolBufferSocketHandler;
import com.rfbsoft.websocket.SocketHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class StompWebSocketConfig implements WebSocketConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(StompWebSocketConfig.class);

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new SocketHandler(), "/name");
        registry.addHandler(new ProtocolBufferSocketHandler(), "/protobuf");
        registry.addHandler(new BinarySocketHandler(), "/binary");
    }



}
