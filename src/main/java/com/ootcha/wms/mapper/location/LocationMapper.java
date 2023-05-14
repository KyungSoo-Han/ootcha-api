package com.ootcha.wms.mapper.location;

import com.ootcha.wms.dto.location.LocationDto;
import com.ootcha.wms.dto.location.LocationSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LocationMapper {

    void saveLocation(List<LocationDto> LocationDto);

    List<LocationDto> findLocationList(LocationSrchDto locationSrchDto);

    void deleteLocation(List<LocationDto> LocationDto);
}
