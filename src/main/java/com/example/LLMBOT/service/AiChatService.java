package com.example.LLMBOT.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class AiChatService {
    private final ChatClient chatClient;
    public String getContextForFlight(String regisNbr) {
        return "";
    }

    public String askQuestion(String message) throws IOException {
        log.info("User sent message: {} ", message);
        ClassPathResource classPathResource = new ClassPathResource("/Context.txt");
        String contextTxt = classPathResource.getContentAsString(StandardCharsets.UTF_8);
        PromptTemplate promptTemplate = new PromptTemplate(contextTxt);
        Prompt prompt = promptTemplate.create(Map.of("message", message));
        System.out.println(prompt.toString());
        String outputText = chatClient
                .prompt(prompt)
                .call()
                .content();

        log.info("Model responed with: {}", outputText.toString());
        return outputText;
    }
}


