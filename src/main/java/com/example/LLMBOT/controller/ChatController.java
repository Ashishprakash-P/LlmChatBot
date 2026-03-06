package com.example.LLMBOT.controller;

import com.example.LLMBOT.service.AiChatService;
import com.example.LLMBOT.service.FuelAgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/llm")
@RequiredArgsConstructor
public class ChatController {

    private final FuelAgentService fuelAgentService;
    private final AiChatService aiChatService;



    @GetMapping("/chat")
    public String chat(@RequestParam String message) throws IOException {
        return aiChatService.askQuestion(message);
    }
}
