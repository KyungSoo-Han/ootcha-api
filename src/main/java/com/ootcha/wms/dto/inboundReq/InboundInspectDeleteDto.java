package com.ootcha.wms.dto.inboundReq;

import lombok.Data;

@Data
public class InboundInspectDeleteDto {

    private String bizCd;
    private String inboundReqDt;
    private Integer inboundReqNo;
    private Integer inboundReqSeq;

}
