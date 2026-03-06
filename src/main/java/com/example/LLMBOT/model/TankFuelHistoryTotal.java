package com.example.LLMBOT.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class TankFuelHistoryTotal {
    private String preFob;
    private String totalFob;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
