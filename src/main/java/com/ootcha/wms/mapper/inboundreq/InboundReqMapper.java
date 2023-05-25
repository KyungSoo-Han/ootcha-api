package com.ootcha.wms.mapper.inboundreq;


import com.ootcha.wms.dto.inboundreq.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InboundReqMapper {

    List<InboundReqDto> findInboundReq(InboundReqSrchDto inboundReqSrchDto);
    List<InboundReqDto> findInboundReqList(InboundReqSrchDto inboundReqSrchDto);
    void saveInboundReq(InboundReqDto inboundReqDto);
    void saveInboundReqItem(Map<Object,Object> inboundReqDto);
    void deleteInboundReq(InboundReqDeleteDto inboundReqDto);
    void deleteInboundReqItem(InboundReqDeleteDto inboundReqDto);
    void deleteInboundReqList(List<InboundReqDeleteDto> inboundReqDto);
    void saveInbound(InboundDto inboundDto);
    List<InboundDto> findInbound(InboundSrchDto inboundSrchDto);
    void saveInboundItem(Map<Object, Object> paramMap);
    List<InboundInspectDto> findInboundInspectList(InboundInspectSrchDto inboundInspectSrchDto);
    void saveInboundInspect(List<InboundInspectDto> inboundInspectDto);
    void deleteInboundInspect(List<InboundInspectDeleteDto> inboundInspectDeleteDto);
    void deleteInbound(List<InboundDeleteDto> inboundDeleteDto);
    void deleteInboundItem(List<InboundDeleteDto> inboundDeleteDto);
}
