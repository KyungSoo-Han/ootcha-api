package com.ootcha.wms.service.destination;



import com.ootcha.wms.dto.destination.DestinationDto;
import com.ootcha.wms.dto.destination.DestinationSrchDto;
import com.ootcha.wms.mapper.destination.DestinationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class DestinationServiceImpl implements DestinationService {
    private final DestinationMapper destinationMapper;

    @Override
    public List<DestinationDto> findDestinationList(DestinationSrchDto destinationDto) {

        return destinationMapper.findDestinationList(destinationDto);
    }

    @Transactional
    public DestinationDto saveDestination(DestinationDto destinationDto){

        destinationDto.setCreatedId("sean");

        destinationMapper.saveDestination(destinationDto);

        return destinationDto;
    }

    @Override
    public DestinationDto deleteDestination(DestinationDto destinationDto) {

        destinationMapper.deleteDestination(destinationDto);
        return null;
    }
}
