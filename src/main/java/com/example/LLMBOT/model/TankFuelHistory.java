package com.example.LLMBOT.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class TankFuelHistory {
    private String tankName;
    private String              tankDisplayName;
    private String preFob;
    private String totalFob;
    private Integer rowNum;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
