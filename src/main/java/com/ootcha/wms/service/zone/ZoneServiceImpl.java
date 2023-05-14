package com.ootcha.wms.service.zone;



import com.ootcha.wms.dto.zone.ZoneDto;
import com.ootcha.wms.dto.zone.ZoneSrchDto;
import com.ootcha.wms.mapper.zone.ZoneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ZoneServiceImpl implements ZoneService {

    private  final ZoneMapper mapper;

    @Override
    public List<ZoneDto> findZoneList(ZoneSrchDto zoneSrchDto){


        return mapper.findZoneList(zoneSrchDto);
    }

    @Override
    @Transactional
    public List<ZoneDto> saveZone(List<ZoneDto> zoneDto)  {

        for(int i=0; i<zoneDto.size(); i++) {
            zoneDto.get(i).setCreatedId("sean");
        }

        mapper.saveZone(zoneDto);

         return null;
    }

    @Override
    @Transactional
    public List<ZoneDto> deleteZone(List<ZoneDto> zoneDto)  {

        mapper.deleteZone(zoneDto);

        return null;
    }

}
