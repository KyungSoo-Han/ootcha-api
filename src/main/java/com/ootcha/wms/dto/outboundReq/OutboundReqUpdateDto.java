package com.ootcha.wms.dto.outboundReq;

import lombok.Data;

@Data
public class OutboundReqUpdateDto {

    private String bizCd;
    private String outboundReqDt;
    private Integer outboundReqNo;
    private Integer outboundReqSeq;
    private Integer checked;

}
