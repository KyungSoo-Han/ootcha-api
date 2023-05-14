package com.ootcha.wms.service.common;

import com.ootcha.wms.dto.common.SlipNoDto;
import com.ootcha.wms.mapper.common.SlipNoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SlipNoService {

    private final SlipNoMapper slipNoMapper;

    public String getSlipNo(SlipNoDto slipNoDto){
        return slipNoMapper.getSlipNo(slipNoDto);
    }
}
