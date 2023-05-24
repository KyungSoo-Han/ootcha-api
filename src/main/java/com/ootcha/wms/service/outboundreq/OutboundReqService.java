package com.ootcha.wms.service.outboundreq;


import com.ootcha.wms.dto.outboundreq.OutboundReqDeleteDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqSrchDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqUpdateDto;

import java.util.List;

public interface OutboundReqService {

    List<OutboundReqDto> findOutboundReq(OutboundReqSrchDto outboundReqSrchDto);
    List<OutboundReqDto> findOutboundReqList(OutboundReqSrchDto outboundReqSrchDto);
    Integer saveOutboundReq(List<OutboundReqDto> outboundReqDto);
    void deleteOutboundReq(OutboundReqDeleteDto outboundReqDto);
    void deleteOutboundReqList(List<OutboundReqDeleteDto> outboundReqDto);
    OutboundReqUpdateDto updateOutboundAppr(List<OutboundReqUpdateDto> updateDto);

}
