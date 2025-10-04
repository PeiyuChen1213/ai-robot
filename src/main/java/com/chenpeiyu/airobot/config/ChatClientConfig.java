package com.chenpeiyu.airobot.config;

import com.chenpeiyu.airobot.advisor.MyLoggerAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {

    @Bean
    public ChatClient chatClient (OpenAiChatModel chatModel){
        return ChatClient.builder(chatModel)
                .defaultSystem("你是一个智能客服 名字叫小宇")
                .defaultAdvisors(new MyLoggerAdvisor(),new SimpleLoggerAdvisor())
                .build();
    }
}
