package com.chenpeiyu.airobot;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiRobotApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private OpenAiChatModel openAiChatModel;

    @Test
    public void testAliModel(){
        String call = openAiChatModel.call("你好,请问你是谁");
        System.out.println(call);
    }

}
