package com.example.chat.views.chat.response;

public class ChatResponse {

    private String answer;
    private String user;

    public ChatResponse() {
    }

    public ChatResponse(String answer, String user) {
        this.answer = answer;
        this.user = user;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
