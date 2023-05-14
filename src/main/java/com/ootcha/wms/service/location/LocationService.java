package com.ootcha.wms.service.location;

import com.ootcha.wms.dto.location.LocationDto;
import com.ootcha.wms.dto.location.LocationSrchDto;

import java.util.List;

public interface LocationService {
    List<LocationDto> findLocationList(LocationSrchDto locationSrchDto);

    List<LocationDto> saveLocation(List<LocationDto> LocationDto);

    List<LocationDto> deleteLocation(List<LocationDto> LocationDto);
}
