package com.ootcha.wms.service.zone;


import com.ootcha.wms.dto.zone.ZoneDto;
import com.ootcha.wms.dto.zone.ZoneSrchDto;

import java.util.List;

public interface ZoneService {

    List<ZoneDto> findZoneList(ZoneSrchDto zoneSrchDto);

    List<ZoneDto> saveZone(List<ZoneDto> zoneDto);

    List<ZoneDto> deleteZone(List<ZoneDto> zoneDto);
}
