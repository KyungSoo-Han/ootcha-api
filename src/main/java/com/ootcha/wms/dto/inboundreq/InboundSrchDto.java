package com.ootcha.wms.dto.inboundreq;

import lombok.Data;

@Data
public class InboundSrchDto {

    private String bizCd;
    private String centerCd;
    private String inboundDt;
    private String inboundFromDt;
    private String inboundToDt;
    private Integer inboundNo;
    private Integer inboundSeq;
    private String customerCd;
    private String supplierCd;
    private String inboundExpDt;
    private int status;

}
