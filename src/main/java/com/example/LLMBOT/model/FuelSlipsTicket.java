package com.example.LLMBOT.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class FuelSlipsTicket {
    private String ticketNum;
    private String gals;
    private String lbs;
    private String fob;
    private Integer rowNum;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
