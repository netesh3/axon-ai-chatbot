package com.example.chat.views.chat.resource;

import com.example.chat.views.chat.request.APIChatRequest;
import com.example.chat.views.chat.response.ChatResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/axon")
public interface ChatResource {

    @PostMapping(value = "/chatterbot",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    ChatResponse chat(@RequestBody APIChatRequest apiChatRequest);


}
