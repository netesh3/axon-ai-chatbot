package com.example.chat.views.chat.resource.impl;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserSessionFactory {

    @Autowired Bot bot;

    private static Map<String, Chat> user = new HashMap<>();

    public UserSessionFactory() {
    }

    public Chat getSession(String userName) {
        if(user.containsKey(userName)){
            return user.get(userName);
        }else {
            Chat chatSession = new Chat(bot);
            user.put(userName, chatSession);
            return chatSession;
        }
    }
}
