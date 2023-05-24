package com.ootcha.wms.dto.outboundreq;

import lombok.Data;

@Data
public class OutboundReqSrchDto {

    private String bizCd;
    private String centerCd;
    private String outboundReqDt;
    private String outboundReqFromDt;
    private String outboundReqToDt;
    private Integer outboundReqNo;
    private Integer outboundReqSeq;
    private String customerCd;
    private String destinationCd;
    private String outboundExpDt;
    private int status;

}
