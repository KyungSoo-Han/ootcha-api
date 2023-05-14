package com.ootcha.wms.service.destination;

import com.ootcha.wms.dto.destination.DestinationDto;
import com.ootcha.wms.dto.destination.DestinationSrchDto;

import java.util.List;

public interface DestinationService {
    List<DestinationDto> findDestinationList(DestinationSrchDto destinationDto);

    public DestinationDto saveDestination(DestinationDto destinationDto);

    DestinationDto deleteDestination(DestinationDto destinationDto);
}
