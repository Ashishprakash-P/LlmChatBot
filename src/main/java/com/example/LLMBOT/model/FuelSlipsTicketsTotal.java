package com.example.LLMBOT.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class FuelSlipsTicketsTotal {
    private String gals;
    private String lbs;
    private String currentFob;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
