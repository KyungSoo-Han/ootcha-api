package com.ootcha.wms.mapper.inbound;

import com.ootcha.wms.dto.inbound.InboundDto;
import com.ootcha.wms.dto.inbound.InboundSrchDto;
import com.ootcha.wms.dto.inboundreq.InboundReqDto;
import com.ootcha.wms.dto.inboundreq.InboundReqSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InboundMapper {

    void saveInbound(Map<String,Object> paramMap);
}
