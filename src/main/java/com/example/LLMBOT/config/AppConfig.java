package com.example.LLMBOT.config;

import com.example.LLMBOT.service.FuelService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemoryRepository;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Configuration
public class AppConfig {
    @Bean
    public ChatMemory chatMemory() {
        return MessageWindowChatMemory.builder()
                .chatMemoryRepository(new InMemoryChatMemoryRepository())
                .maxMessages(10)
                .build();
    }
    @Bean
    public ChatClient chatClient(FuelService fuelService, ChatClient.Builder builder, ChatMemory chatMemory) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("/SystemDefault.txt");
        String systemDefaultTxt = classPathResource.getContentAsString(StandardCharsets.UTF_8);
        return builder
                .defaultAdvisors(
                        MessageChatMemoryAdvisor.builder(chatMemory)
                                .conversationId(ChatMemory.CONVERSATION_ID)
                                .build()
                )
                .defaultSystem(systemDefaultTxt)
                .defaultTools(fuelService)
                .build();
    }
}
