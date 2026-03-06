package com.example.LLMBOT.DTO;

import com.example.LLMBOT.model.FuelSlipsTicket;
import com.example.LLMBOT.model.FuelSlipsTicketsTotal;
import com.example.LLMBOT.model.TankFuelHistory;
import com.example.LLMBOT.model.TankFuelHistoryTotal;
import com.example.LLMBOT.model.FuelReportValidationResultDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class FuelReportDTO {
    private String flightNbrDtKey;

    public Map<String, FuelReportValidationResultDto> getValidationResults() {
        return validationResults;
    }

    public void setValidationResults(Map<String, FuelReportValidationResultDto> validationResults) {
        this.validationResults = validationResults;
    }

    private String regisNbr;
    private String flightDateTime;
    private String fuelType;
    private String fuelDensity;
    private String fuelTemp;
    private String prevFlightBlkInFuel;
    private List<FuelSlipsTicket> fuelSlipsTickets = null;
    private FuelSlipsTicketsTotal fuelSlipsTicketsTotal;
    private List<TankFuelHistory> tankFuelHistory = null;
    private TankFuelHistoryTotal tankFuelHistoryTotal;
    private String fuelReqFPS;
    private String                lastFltReleaseVersionNbr;
    private String                fuelReqSource;
    private List<String> remarks = null;
    private String fdxRep;

    private List<String>        errors               = new ArrayList<String>();
    private List<String>        warnings             = new ArrayList<String>();
    private Map<String, FuelReportValidationResultDto> validationResults = new HashMap<String, FuelReportValidationResultDto>();

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
