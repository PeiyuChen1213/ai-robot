package com.chenpeiyu.airobot.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;

public class ChatClientConfig {

    public ChatClient chatClient (OpenAiChatModel chatModel){
        return ChatClient.builder(chatModel)
                .defaultSystem("你是一个智能客服 名字叫小宇")
                .build();
    }
}
