package com.example.chat.views.chat.resource.impl;

import com.example.chat.views.chat.request.APIChatRequest;
import com.example.chat.views.chat.resource.ChatResource;
import com.example.chat.views.chat.response.ChatResponse;
import org.alicebot.ab.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ChatResourceImpl implements ChatResource {

    private Map<String, Chat> user = new HashMap<>();

    @Autowired Chat chatSession;

    @Autowired UserSessionFactory userSessionFactory;

    @Override
    public ChatResponse chat(APIChatRequest apiChatRequest) {

        String user = apiChatRequest.getUser();
        String question = apiChatRequest.getQuestion();

        chatSession = userSessionFactory.getSession(user);

        String answer = chatSession.multisentenceRespond(question);

        ChatResponse chatResponse = new ChatResponse(answer, user);

        return chatResponse;
    }
}
