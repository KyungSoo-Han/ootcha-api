package com.ootcha.wms.service.inboundreq;


import com.ootcha.wms.dto.inboundreq.*;

import java.util.List;

public interface InboundReqService {

    List<InboundReqDto> findInboundReq(InboundReqSrchDto inboundReqSrchDto);
    List<InboundReqDto> findInboundReqList(InboundReqSrchDto inboundReqSrchDto);
    Integer saveInboundReq(List<InboundReqDto> inboundReqDto);
    void deleteInboundReq(InboundReqDeleteDto inboundReqDto);
    void deleteInboundReqList(List<InboundReqDeleteDto> inboundReqDto);
    InboundReqUpdateDto updateInboundAppr(List<InboundReqUpdateDto> updateDto);
    Integer saveInbound(List<InboundDto> inboundDto);
    List<InboundDto> findInbound(InboundSrchDto inboundSrchDto);
    List<InboundInspectDto> findInboundInspectList(InboundInspectSrchDto inboundInspectSrchDto);
    InboundInspectDto saveInboundInspect(List<InboundInspectDto> inboundInspectDto);
    InboundInspectDeleteDto deleteInboundInspect(List<InboundInspectDeleteDto> inboundInspectDeleteDto);
    InboundDeleteDto deleteInbound(List<InboundDeleteDto> inboundDeleteDto);
}