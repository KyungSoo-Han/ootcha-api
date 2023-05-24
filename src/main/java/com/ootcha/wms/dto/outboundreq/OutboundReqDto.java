package com.ootcha.wms.dto.outboundreq;

import lombok.Data;

@Data
public class OutboundReqDto {

    private String bizCd;
    private String centerCd;
    private Integer outboundReqNo;
    private String outboundReqDt;
    private String customerCd;
    private String customerNm;
    private String destinationCd;
    private String destinationNm;
    private String outboundType;
    private String outboundExpDt;
    private String remark;
    private Integer outboundReqSeq;
    private String itemCd;
    private String itemNm;
    private String expDt;
    private String makeDt;
    private String makeLotNo;
    private Integer price;
    private Integer qty;
    private String subRemark;
    private Integer status;
    private String createdId;
    private String createdDt;
    private String modifiedId;
    private String modifiedDt;
}
