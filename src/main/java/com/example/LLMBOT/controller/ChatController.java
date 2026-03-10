package com.example.LLMBOT.controller;

import com.example.LLMBOT.service.AiChatService;
import com.example.LLMBOT.service.FuelAgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

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
