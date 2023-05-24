package com.ootcha.wms.dto.inboundreq;

import lombok.Data;

@Data
public class InboundReqUpdateDto {

    private String bizCd;
    private String inboundReqDt;
    private Integer inboundReqNo;
    private Integer inboundReqSeq;
    private Integer checked;

}
