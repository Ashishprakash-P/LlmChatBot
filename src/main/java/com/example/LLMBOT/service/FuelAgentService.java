package com.example.LLMBOT.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FuelAgentService {
    private final FuelService fuelService;
    private final ChatClient chatClient;
    private final AiChatService aiChatService;

    private String investigateDiscrepancy(String regisNbr) {
        return "";
    }
}
