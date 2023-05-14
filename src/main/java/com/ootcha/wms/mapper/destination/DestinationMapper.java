package com.ootcha.wms.mapper.destination;

import com.ootcha.wms.dto.destination.DestinationDto;
import com.ootcha.wms.dto.destination.DestinationSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DestinationMapper {

    void saveDestination(DestinationDto destinationDto);

    List<DestinationDto> findDestinationList(DestinationSrchDto destinationSrchDto);

    void deleteDestination(DestinationDto destinationDto);
}
