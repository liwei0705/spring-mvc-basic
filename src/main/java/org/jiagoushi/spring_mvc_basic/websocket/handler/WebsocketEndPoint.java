package org.jiagoushi.spring_mvc_basic.websocket.handler;

import org.springframework.web.socket.TextMessage;  
import org.springframework.web.socket.WebSocketSession;  
import org.springframework.web.socket.handler.TextWebSocketHandler;  
 
public class WebsocketEndPoint extends TextWebSocketHandler {  
 
   @Override  
   protected void handleTextMessage(WebSocketSession session,  
           TextMessage message) throws Exception {  
       super.handleTextMessage(session, message);  
       
       TextMessage returnMessage = new TextMessage("服务器接收成功：" + message.getPayload());  
       session.sendMessage(returnMessage);  
   }  
} 