package com.example.LLMBOT.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
public class EfitForteLegExt {
    private long forteLegExtOidNbr;

    private String acStatusDesc;

    private String actlFltQty;

    private Timestamp actlInZuluTmstp;

    private Timestamp actlOutZuluTmstp;

    private String arrGate;

    private String blkQty;

    private String blockInFlg;

    private BigDecimal capEmpNbr;

    private String closedFlg;

    private String depGate;

    private String equipCd;

    private Timestamp estInZuluTmstp;

    private Timestamp estOutZuluTmstp;

    private BigDecimal eventOid;

    private BigDecimal fboNbr;

    private BigDecimal finalFuelQty;

    private String fltNbr;

    private BigDecimal fltPlanFuelQty;

    private String fltQty;

    private Date fltZuluDt;

    private BigDecimal fobNbr;

    private Timestamp forteUpdatedTmstp;

    private String iataDest;

    private String iataOrig;

    private String icaoDestCd;

    private String icaoOrigCd;

    private BigDecimal initialFuelQty;

    private String lastFltReleaseByNm;

    private Timestamp lastFltReleaseTmstp;

    private Timestamp lastUpdateTmstp;

    private String lastUpdatedBy;

    private String legNbr;

    private BigDecimal nextLegOidNbr;

    private String pgmNm;

    private BigDecimal prevLegOidNbr;

    private String regisNbr;

    private BigDecimal rmngFuelNbr;

    private Timestamp schedInZuluTmstp;

    private Timestamp schedOutZuluTmstp;

    private String statusCd;

    private String statusDesc;

    private String tailNbr;

    private String takeOffFlg;

    private String trunkFdrFlg;

    private String lastFltReleaseVersionNbr;

    private String acarsFltSumryRcvdFlg;

    private String weightAndBalanceFinalRcvdFlg;

    private BigDecimal minimumRequiredFuelQty;

    private BigDecimal inRangeRmngFuelNbr;

    private BigDecimal summaryRmngFuelNbr;

    private BigDecimal legClosedRmngFuelNbr;

    private BigDecimal statChngRmngFuelNbr;

    public EfitForteLegExt() {
    }
}
