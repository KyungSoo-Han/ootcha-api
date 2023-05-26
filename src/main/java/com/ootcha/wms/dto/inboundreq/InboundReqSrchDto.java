package com.ootcha.wms.dto.inboundreq;

import lombok.Data;

@Data
public class InboundReqSrchDto {

    private String bizCd;
    private String centerCd;
    private String inboundReqDt;
    private String inboundReqFromDt;
    private String inboundReqToDt;
    private Integer inboundReqNo;
    private Integer inboundReqSeq;
    private String customerCd;
    private String supplierCd;
    private String inboundExpDt;
    private Integer status;
    private String inboundExpFromDt;
    private String inboundExpToDt;

}
