package com.example.LLMBOT.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
public class EfitFuelSlip {
    private long fuelSlipOidNbr;

    private String apuRunningFlg;

    private BigDecimal calcUplifted;

    private Timestamp completedTmstp;

    private BigDecimal eventOid;

    private String fuelAppName;

    private double fuelDensity;

    private String fuelEquipId;

    private Timestamp fuelInvTmstp;

    private double fuelTemp;

    private Double fuelFreezeTemp;

    private String fuelType;

    private String fuelerEmpId;

    private BigDecimal grossUplifted;

    private String handheldId;

    private String highMxFlg;

    private Timestamp lastUpdateTmstp;

    private String lastUpdatedBy;

    private String measurementUnits;

    private BigDecimal meteredFuel;

    private BigDecimal netUplifted;

    private String pgmNm;

    private String regisNbr;

    private String remarksTxt;

    private BigDecimal startTotalizer;

    private String statusDesc;

    private BigDecimal stopTotalizer;

    private BigDecimal totFuelUplifted;

    private BigDecimal totalFobPreFuelQty;

    private BigDecimal totalFobQty;

    private String txCompletedByDesc;

    private String validationPassFlg;

    private String vendorName;

    private String vendorTicketNbr;

    private Long fobRecordOidNbr;

    private String stationIataCd;

    private BigDecimal fuelRequestedQty;

    private String fuelSlipTypeDesc;

    private String workRequestNbrDesc;

    private String signFlg;

    private String signByEmpNbr;

    private Timestamp signTmstp;

    private Long forteLegOidNbr;

    private Long fuelRequestOidNbr;

    private Long      acGroundSegmentNbr;
    private Timestamp rightAngleUpdateTmstp;

    private String defuelFlg;

    private String a300FuelCapsInstalled;

    private String isInopTransactionFlag;

    private String foisUpdatedFlg;

    private String createBy;

    public EfitFuelSlip() {
    }
}
