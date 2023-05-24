package com.ootcha.wms.mapper.inboundappr;

import com.ootcha.wms.dto.inboundreq.InboundReqDto;
import com.ootcha.wms.dto.inboundreq.InboundReqSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InboundApprMapper {

    List<InboundReqDto> findInboundReqMst(InboundReqSrchDto inboundReqSrchDto);
    List<InboundReqDto> findInboundReqDtl(InboundReqSrchDto inboundReqSrchDto);


}
