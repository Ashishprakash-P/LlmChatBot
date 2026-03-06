package com.example.LLMBOT.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
public class EfitAircraftFobRecord {

    private Long aircraftFobRecordOidNbr;

    private Long aircraftOidNbr;

    private String equipCd;

    private BigDecimal eventOid;

    private Timestamp lastUpdateTmstp;

    private String lastUpdatedBy;

    private String lastUpdtSrcDesc;

    private String lastVerifiedBy;

    private Timestamp lastVerifiedTmstp;

    private String pgmNm;

    private BigDecimal preFuelTankFobQty1;

    private BigDecimal preFuelTankFobQty10;

    private BigDecimal preFuelTankFobQty2;

    private BigDecimal preFuelTankFobQty3;

    private BigDecimal preFuelTankFobQty4;

    private BigDecimal preFuelTankFobQty5;

    private BigDecimal preFuelTankFobQty6;

    private BigDecimal preFuelTankFobQty7;

    private BigDecimal preFuelTankFobQty8;

    private BigDecimal preFuelTankFobQty9;

    private BigDecimal preTotFobQty;

    private String regisNbr;

    private String tailNbr;

    private BigDecimal tankFobQty1;

    private BigDecimal tankFobQty10;

    private BigDecimal tankFobQty2;

    private BigDecimal tankFobQty3;

    private BigDecimal tankFobQty4;

    private BigDecimal tankFobQty5;

    private BigDecimal tankFobQty6;

    private BigDecimal tankFobQty7;

    private BigDecimal tankFobQty8;

    private BigDecimal tankFobQty9;

    private String tankPosDesc1;

    private String tankPosDesc10;

    private String tankPosDesc2;

    private String tankPosDesc3;

    private String tankPosDesc4;

    private String tankPosDesc5;

    private String tankPosDesc6;

    private String tankPosDesc7;

    private String tankPosDesc8;

    private String tankPosDesc9;

    private BigDecimal totFobQty;

    private Long acarsRequestIdNbr;

    private String acarsRequestDesc;

    private Timestamp acarsRequestTmstp;

    private Timestamp acarsResponseTmstp;

    private String tankInopFlg1;

    private String tankInopFlg2;

    private String tankInopFlg3;

    private String tankInopFlg4;

    private String tankInopFlg5;

    private String tankInopFlg6;

    private String tankInopFlg7;

    private String tankInopFlg8;

    private String tankInopFlg9;

    private String tankInopFlg10;

    private String tankVerifyMethod1Desc;

    private String tankVerifyMethod2Desc;

    private String tankVerifyMethod3Desc;

    private String tankVerifyMethod4Desc;

    private String tankVerifyMethod5Desc;

    private String tankVerifyMethod6Desc;

    private String tankVerifyMethod7Desc;

    private String tankVerifyMethod8Desc;

    private String tankVerifyMethod9Desc;

    private String tankVerifyMethod10Desc;

    private String tankVerifiedBy1EmpNbr;

    private String tankVerifiedBy2EmpNbr;

    private String tankVerifiedBy3EmpNbr;

    private String tankVerifiedBy4EmpNbr;

    private String tankVerifiedBy5EmpNbr;

    private String tankVerifiedBy6EmpNbr;

    private String tankVerifiedBy7EmpNbr;

    private String tankVerifiedBy8EmpNbr;

    private String tankVerifiedBy9EmpNbr;

    private String tankVerifiedBy10EmpNbr;

    private Long   acGroundSegmentNbr;

    private String crewComments;

    private String tankDistValidFlg;

    public EfitAircraftFobRecord() {
    }

}
