package com.ootcha.wms.dto.inboundinsepect;

import lombok.Data;

@Data
public class InboundInspectSrchDto {

    private String bizCd;
    private String centerCd;
    private String inboundDt;
    private String inboundFromDt;
    private String inboundToDt;
    private Integer inboundNo;
    private Integer inboundSeq;
    private String customerCd;
    private String supplierCd;
    private String inboundExpFromDt;
    private String inboundExpToDt;
    private String status;

}
