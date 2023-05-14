package com.ootcha.wms.mapper.common;

import com.ootcha.wms.dto.common.SlipNoDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SlipNoMapper {
    String getSlipNo(SlipNoDto slipNoDto);
}
