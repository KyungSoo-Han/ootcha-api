package com.ootcha.wms.service.outboundReq;


import com.ootcha.wms.dto.outboundReq.OutboundReqDeleteDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqSrchDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqUpdateDto;

import java.util.List;

public interface OutboundReqService {

    List<OutboundReqDto> findOutboundReq(OutboundReqSrchDto outboundReqSrchDto);
    List<OutboundReqDto> findOutboundReqList(OutboundReqSrchDto outboundReqSrchDto);
    Integer saveOutboundReq(List<OutboundReqDto> outboundReqDto);
    void deleteOutboundReq(OutboundReqDeleteDto outboundReqDto);
    void deleteOutboundReqList(List<OutboundReqDeleteDto> outboundReqDto);
    OutboundReqUpdateDto updateOutboundAppr(List<OutboundReqUpdateDto> updateDto);

}
