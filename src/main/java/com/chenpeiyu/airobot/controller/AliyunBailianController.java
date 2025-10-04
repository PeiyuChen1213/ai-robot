package com.chenpeiyu.airobot.controller;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/v6/ai")
public class AliyunBailianController {

    @Resource
    private ChatClient chatClient;


    /**
     * 流式对话
     * @param message
     * @return
     */
    @GetMapping(value = "/generateStream", produces = "text/html;charset=utf-8")
    public String generateStream(@RequestParam(value = "message", defaultValue = "你是谁？") String message) {

        // 使用chat client 替换之前的chat model的方法
        return chatClient.prompt()
                .user(message) // 提示词// 流式输出
                .call()
                .content();
    }

}
