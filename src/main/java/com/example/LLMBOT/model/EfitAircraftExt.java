package com.example.LLMBOT.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
public class EfitAircraftExt {
    private long aircraftExtOidNbr;

    private String apuOnFlg;

    private BigDecimal arrFltOidNbr;

    private BigDecimal arrFobRecordOidNbr;

    private BigDecimal beforeAfterToleranceQty;

    private BigDecimal currentFltOidNbr;

    private String equipCd;

    private Timestamp estOutTmstp;

    private BigDecimal eventOid;

    private Timestamp fuelInitReportTmstp;

    private String fuelInitReportTxt;

    private String fuelUpliftInProgressFlg;

    private BigDecimal fuelingAccuracyNbr;

    private String fuelingStatDesc;

    private String gateNbr;

    private Timestamp lastBlkInTmstp;

    private BigDecimal lastFobRecordOidNbr;

    private BigDecimal lastFobTankOidNbr;

    private BigDecimal lastRequestedFuelQty;

    private String lastStaIataCd;

    private Timestamp lastUpdateTmstp;

    private String lastUpdatedBy;

    private BigDecimal massVolToleranceQty;

    private String pgmNm;

    private String regisNbr;

    private String tailNbr;

    private String tankInopFlg1;

    private String tankInopFlg10;

    private String tankInopFlg2;

    private String tankInopFlg3;

    private String tankInopFlg4;

    private String tankInopFlg5;

    private String tankInopFlg6;

    private String tankInopFlg7;

    private String tankInopFlg8;

    private String tankInopFlg9;

    private BigDecimal totFobNbr;

    private Timestamp totFobUpdateTmstp;

    private Timestamp lastAcarsFobQueryTmstp;

    private Timestamp lastAcarsFobReceivedTmstp;

    private Long lastAcarsFobRecordOidNbr;

    private String    fleetTypeCd;
    private String    fleetTypeDetailCd;
    private String    groundSegmentNbr;
    private String    acarsInitFlg;
    private Timestamp lastAcarsReportSentTmstp;
    private String    lastAcarsReportUniqId;
    private Timestamp lastAcarsReportAckTmstp;
    private String    fuelReportValidFlg;

    private Long lastMinReqFobOidNbr;
    private Timestamp lastAcarsMinFobQueryTmstp;
    private String    melReferenceDesc;
    private Long      melControlNbr;

    private String acarsEnabledFlg;
}
