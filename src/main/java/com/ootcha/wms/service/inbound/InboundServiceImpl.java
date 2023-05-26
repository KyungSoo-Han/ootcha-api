package com.ootcha.wms.service.inbound;


import com.ootcha.wms.dto.inbound.InboundDto;
import com.ootcha.wms.mapper.inbound.InboundMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InboundServiceImpl implements InboundService{
    private final InboundMapper inboundMapper;
    @Override
    public void saveInbound(List<InboundDto> inboundDto) {
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("bizCd", inboundDto.get(0).getBizCd() );
        paramMap.put("centerCd", inboundDto.get(0).getCenterCd() );
        paramMap.put("inboundDt", "2023-05-27" );
        paramMap.put("list", inboundDto);

        inboundMapper.saveInbound(paramMap);

    }
}