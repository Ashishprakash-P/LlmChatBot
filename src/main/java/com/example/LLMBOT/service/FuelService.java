package com.example.LLMBOT.service;

import com.example.LLMBOT.DTO.FuelReportDTO;
import com.example.LLMBOT.model.EfitAircraftExt;
import com.example.LLMBOT.model.EfitForteLegExt;
import com.example.LLMBOT.model.FuelSlipsTicket;
import com.example.LLMBOT.model.FuelSlipsTicketsTotal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class FuelService {
    @Tool(
            name = "getFuelReport",
            description = "Fetches the fuel report for a specific aircraft registration number (regisNbr). Only call this when the user provides a valid registration number."
    )
    public FuelReportDTO getFuelReport(String regisNbr) {
        log.info("Model fetched FuelReportDTO for {}", regisNbr);
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("location","ARA");

        FuelSlipsTicket fuelSlipsTicket1 = new FuelSlipsTicket();
        fuelSlipsTicket1.setTicketNum("1");
        fuelSlipsTicket1.setFob("27500");
        fuelSlipsTicket1.setLbs("27500");
        fuelSlipsTicket1.setRowNum(1);
        fuelSlipsTicket1.setAdditionalProperties(props);

        FuelSlipsTicketsTotal fuelSlipsTicketsTotal = new FuelSlipsTicketsTotal();
        fuelSlipsTicketsTotal.setLbs("27500");
        fuelSlipsTicketsTotal.setCurrentFob("27500");

        FuelReportDTO fuelReport = new FuelReportDTO();
        fuelReport.setRegisNbr(regisNbr);
        fuelReport.setPrevFlightBlkInFuel("25000");
        fuelReport.setFuelSlipsTickets(List.of(fuelSlipsTicket1));
        fuelReport.setFuelSlipsTicketsTotal(fuelSlipsTicketsTotal);

        return fuelReport;
    }
    @Tool(
            name = "getEfitForteLegExt",
            description = "Fetches the EfitForteLegExt record for a specific aircraft registration number (regisNbr). Only call this when the user provides a valid registration number."
    )
    public EfitForteLegExt getEfitForteLegExt(String regisNbr) {
        log.info("Model fetched EfitForteLegExt for {}", regisNbr);
        EfitForteLegExt efitForteLegExt = new EfitForteLegExt();
        efitForteLegExt.setRegisNbr(regisNbr);
        efitForteLegExt.setInRangeRmngFuelNbr(BigDecimal.valueOf(27500));
        return efitForteLegExt;
    }

    @Tool(
            name = "getEfitAircraftExt",
            description = "Fetches the EfitAircraftExt record for a specific aircraft registration number (regisNbr). Only call this when the user provides a valid registration number."
    )
    public EfitAircraftExt getEfitAircraftExt(String regisNbr) {
        log.info("Model fetched EfitAircraftExt for {}", regisNbr);
        EfitAircraftExt efitAircraftExt = new EfitAircraftExt();
        efitAircraftExt.setRegisNbr(regisNbr);
        efitAircraftExt.setLastStaIataCd("MEM");
        return efitAircraftExt;
    }

}
