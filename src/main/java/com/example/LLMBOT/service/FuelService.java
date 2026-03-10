package com.example.LLMBOT.service;

import com.example.LLMBOT.model.FuelSlipsTicket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
public class FuelService {

    @Tool(
            name = "getBlockInFuel",
            description = "Fetches the block in fuel for a specific aircraft registration number (regisNbr)."
    )
    public BigDecimal getBlockInFuel(String regisNbr) {
        log.info("Model fetched blockInFuel from FuelReportDTO for {}", regisNbr);
        BigDecimal prevBlockInFuel = BigDecimal.valueOf(27000);
        return prevBlockInFuel;
    }

    @Tool(
            name = "getFirstTicket",
            description = "Fetches the first ticket for a specific aircraft registration number (regisNbr)."
    )
    public FuelSlipsTicket getFirstTicket(String regisNbr) {
        log.info("Model fetched location from FirstTicket for {}", regisNbr);
        FuelSlipsTicket fuelSlipsTicket = new FuelSlipsTicket();
        fuelSlipsTicket.setFob(BigDecimal.valueOf(27000));
        fuelSlipsTicket.setLocation("MEM");
        return fuelSlipsTicket;
    }

    @Tool(
            name = "getInRangeRmngFuelNbr",
            description = "Fetches the Remaining fuel Nbr for a specific aircraft registration number (regisNbr). Only call this when the user provides a valid registration number."
    )
    public BigDecimal getInRangeRmngFuelNbr(String regisNbr) {
        log.info("Model fetched inRangeRmngFuelNbr from EfitForteLegExt for {}", regisNbr);
        BigDecimal inRangeRmngFuelNbr = BigDecimal.valueOf(20000);
        return inRangeRmngFuelNbr;
    }

    @Tool(
            name = "getAircraftLocation",
            description = "Fetches the aircraft location for a specific registration number (regisNbr)."
    )
    public String getAircraftLocation(String regisNbr) {
        log.info("Model fetched location from EfitAircraftExt for {}", regisNbr);
        String aircraftLocation = "ARA";
        return aircraftLocation;
    }
}
