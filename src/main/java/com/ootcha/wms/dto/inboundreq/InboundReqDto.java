package com.ootcha.wms.dto.inboundreq;

import lombok.Data;

@Data
public class InboundReqDto {

    private String bizCd;
    private String centerCd;
    private Integer inboundReqNo;
    private String inboundReqDt;
    private String customerCd;
    private String customerNm;
    private String supplierCd;
    private String supplierNm;
    private String inboundType;
    private String inboundExpDt;
    private String remark;
    private Integer inboundReqSeq;
    private String itemCd;
    private String itemNm;
    private String expDt;
    private String makeDt;
    private String makeLotNo;
    private Integer price;
    private Integer qty;
    private String subRemark;
    private String status;
    private String createdId;
    private String createdDt;
    private String modifiedId;
    private String modifiedDt;
}
