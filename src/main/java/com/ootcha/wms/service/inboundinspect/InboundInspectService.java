package com.ootcha.wms.service.inboundinspect;

import com.ootcha.wms.dto.inboundinsepect.InboundInspectDto;
import com.ootcha.wms.dto.inboundinsepect.InboundInspectSrchDto;

import java.util.List;

public interface InboundInspectService {
    List<InboundInspectDto> findInboundInspectList(InboundInspectSrchDto inspectSrchDto);
}
