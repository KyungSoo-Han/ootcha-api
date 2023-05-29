package com.ootcha.wms.service.inbound;


import com.ootcha.wms.dto.inbound.InboundDto;
import com.ootcha.wms.dto.inbound.InboundSrchDto;
import com.ootcha.wms.mapper.inbound.InboundMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

        for (InboundDto dto : inboundDto) {
            System.out.println("dto = " + dto);
        }

        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("bizCd", inboundDto.get(0).getBizCd() );
        paramMap.put("centerCd", inboundDto.get(0).getCenterCd() );
        paramMap.put("createdId", inboundDto.get(0).getCreatedId());
        paramMap.put("inboundDt", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        paramMap.put("list", inboundDto);

        inboundMapper.saveInbound(paramMap);

    }

    @Override
    public List<InboundDto> findInboundMst(InboundSrchDto inboundSrchDto) {

        return inboundMapper.findInboundMst(inboundSrchDto);
    }

    @Override
    public List<InboundDto> findInboundDtl(InboundSrchDto inboundSrchDto) {
        return inboundMapper.findInboundDtl(inboundSrchDto);
    }
}
