package com.ootcha.wms.dto.inboundinsepect;

import lombok.Data;

@Data
public class InboundInspectDto {

    private String bizCd;
    private String centerCd;
    private String inspectDt;
    private Integer inspectNo;
    private Integer inspectSeq;
    private String inboundDt;
    private Integer inboundNo;
    private Integer inboundReqNo;
    private String inboundReqDt;
    private String customerCd;
    private String customerNm;
    private String supplierCd;
    private String supplierNm;
    private String inboundType;
    private String inboundExpDt;
    private String remark;
    private Integer inboundSeq;
    private Integer inboundReqSeq;
    private String itemCd;
    private String itemNm;
    private String expDt;
    private String makeDt;
    private String makeLotNo;
    private Integer inboundQty;
    private Integer goodQty;
    private Integer badQty;
    private String badReason;
    private String subRemark;
    private Integer status;
    private String createdId;
    private String createdDt;
    private String modifiedId;
    private String modifiedDt;
    private String inspectYn;

}
