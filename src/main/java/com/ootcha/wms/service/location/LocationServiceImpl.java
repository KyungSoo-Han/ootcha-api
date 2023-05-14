package com.ootcha.wms.service.location;



import com.ootcha.wms.dto.location.LocationDto;
import com.ootcha.wms.dto.location.LocationSrchDto;
import com.ootcha.wms.mapper.location.LocationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {
    private final LocationMapper locationMapper;

    @Override
    public List<LocationDto> findLocationList(LocationSrchDto locationSrchDto) {

        return locationMapper.findLocationList(locationSrchDto);
    }

    @Transactional
    public List<LocationDto> saveLocation(List<LocationDto> LocationDto){

        for(int i=0; i<LocationDto.size(); i++) {
            LocationDto.get(i).setCreatedId("sean");
        }

        locationMapper.saveLocation(LocationDto);

        return null;
    }

    @Override
    public List<LocationDto> deleteLocation(List<LocationDto> LocationDto) {

        locationMapper.deleteLocation(LocationDto);
        return null;
    }
}
