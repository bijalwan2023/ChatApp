//package com.ChatAppApplication.controller;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ChatAppApplication.models.ChatMessage;
//
//
//
//@Controller
//public class ChatController {
//	
//	@MessageMapping("/chat.register")
//	@SendTo("/topic/public")
//	public ChatMessage register(@Payload ChatMessage message,SimpMessageHeaderAccessor headerAccessor) {
//		headerAccessor.getSessionAttributes().put("username", message.getSender());
//		return message;
//		
//	}
//
//	@MessageMapping("/chat.send")
//	@SendTo("/topic/public")
//	public ChatMessage sendMessage(@RequestBody ChatMessage message,Authentication authentication) throws Exception {
//		if (authentication != null && authentication.isAuthenticated()) {
//            return message;
//        } else {
//            throw new Exception("User not authenticated");
//        }
//
//	}
//}
