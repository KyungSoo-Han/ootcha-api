package com.ootcha.wms.service.inboundappr;

import com.ootcha.wms.dto.inboundreq.InboundReqDto;
import com.ootcha.wms.dto.inboundreq.InboundReqSrchDto;

import java.util.List;

public interface InboundApprService {

    List<InboundReqDto> findInboundReqMst(InboundReqSrchDto inboundReqSrchDto);
    List<InboundReqDto> findInboundReqDtl(InboundReqSrchDto inboundReqSrchDto);
}
