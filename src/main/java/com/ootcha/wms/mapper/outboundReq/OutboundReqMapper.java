package com.ootcha.wms.mapper.outboundReq;


import com.ootcha.wms.dto.outboundReq.OutboundReqDeleteDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqSrchDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqUpdateDto;
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
