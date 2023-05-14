package com.ootcha.wms.service.center;


import com.ootcha.wms.dto.center.CenterDto;
import com.ootcha.wms.dto.center.CenterSrchDto;

import java.util.List;

public interface CenterService {

    List<CenterDto> findCenterList(CenterSrchDto centerDto);

    CenterDto saveCenter(CenterDto centerDto);

    CenterDto deleteCenter(CenterDto centerDto);
}
