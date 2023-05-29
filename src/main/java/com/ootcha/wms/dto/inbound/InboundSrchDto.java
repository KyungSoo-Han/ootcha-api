package com.ootcha.wms.dto.inbound;

import lombok.Data;

@Data
public class InboundSrchDto {

    private String bizCd;
    private String centerCd;
    private String inboundDt;
    private String inboundReqDt;
    private String inboundFromDt;
    private String inboundToDt;
    private Integer inboundNo;
    private Integer inboundReqNo;
    private Integer inboundSeq;
    private String customerCd;
    private String supplierCd;
    private String inboundExpFromDt;
    private String inboundExpToDt;
    private String status;

}
