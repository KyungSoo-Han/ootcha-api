package com.ootcha.wms.mapper.zone;


import com.ootcha.wms.dto.zone.ZoneDto;
import com.ootcha.wms.dto.zone.ZoneSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZoneMapper {

    List<ZoneDto> findZoneList(ZoneSrchDto zoneSrchDto);

    void saveZone(List<ZoneDto> zoneDto);


    void deleteZone(List<ZoneDto> zoneDto);

}
