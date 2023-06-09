package com.ootcha.wms.mapper.outboundreq;


import com.ootcha.wms.dto.outboundreq.OutboundReqDeleteDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqSrchDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqUpdateDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OutboundReqMapper {

    List<OutboundReqDto> findOutboundReq(OutboundReqSrchDto outboundReqSrchDto);
    List<OutboundReqDto> findOutboundReqList(OutboundReqSrchDto outboundReqSrchDto);
    void saveOutboundReq(OutboundReqDto outboundReqDto);
    void saveOutboundReqItem(Map<Object,Object> outboundReqDto);
    void deleteOutboundReq(OutboundReqDeleteDto outboundReqDto);
    void deleteOutboundReqItem(OutboundReqDeleteDto outboundReqDto);
    void deleteOutboundReqList(List<OutboundReqDeleteDto> outboundReqDto);
    void updateOutboundApprRefuse(OutboundReqUpdateDto updateDto);
    void updateOutboundAppr(OutboundReqUpdateDto updateDto);

}
