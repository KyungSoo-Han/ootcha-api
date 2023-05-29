package com.ootcha.wms.service.inbound;

import com.ootcha.wms.dto.inbound.InboundDto;
import com.ootcha.wms.dto.inbound.InboundSrchDto;
import com.ootcha.wms.dto.inboundreq.InboundReqDto;

import java.util.List;

public interface InboundService {

    void saveInbound(List<InboundDto> inboundDto);

    List<InboundDto> findInboundMst(InboundSrchDto inboundSrchDto);

    List<InboundDto> findInboundDtl(InboundSrchDto inboundSrchDto);
}
