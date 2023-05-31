package com.ootcha.wms.mapper.inboundinspect;

import com.ootcha.wms.dto.inboundinsepect.InboundInspectDto;
import com.ootcha.wms.dto.inboundinsepect.InboundInspectSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InboundInspectMapper {

    List<InboundInspectDto> findInboundInspectList(InboundInspectSrchDto inspectSrchDto);
}
