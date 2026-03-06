package com.example.LLMBOT.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuelReportValidationResultDto {
    private String        name;
    private String passFlag;
    private String        remarks;
    private int           displayOrder;
}
