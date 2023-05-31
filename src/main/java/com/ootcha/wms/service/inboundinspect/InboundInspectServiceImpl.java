package com.ootcha.wms.service.inboundinspect;

import com.ootcha.wms.dto.inboundinsepect.InboundInspectDto;
import com.ootcha.wms.dto.inboundinsepect.InboundInspectSrchDto;
import com.ootcha.wms.mapper.inboundinspect.InboundInspectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class InboundInspectServiceImpl implements InboundInspectService{
    private final InboundInspectMapper inboundInspectMapper;
    @Override
    public List<InboundInspectDto> findInboundInspectList(InboundInspectSrchDto inspectSrchDto) {
        return inboundInspectMapper.findInboundInspectList(inspectSrchDto);
    }
}
