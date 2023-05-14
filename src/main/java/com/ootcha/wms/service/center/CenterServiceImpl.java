package com.ootcha.wms.service.center;


import com.ootcha.wms.dto.center.CenterDto;
import com.ootcha.wms.dto.center.CenterSrchDto;
import com.ootcha.wms.mapper.center.CenterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CenterServiceImpl implements CenterService {

    private  final CenterMapper mapper;

    @Override
    public List<CenterDto> findCenterList(CenterSrchDto centerDto){

            System.out.println(mapper.findCenterList(centerDto));

        return mapper.findCenterList(centerDto);
    }

    @Override
    @Transactional
    public CenterDto saveCenter(CenterDto centerDto)  {

        centerDto.setCreatedId("sean");

         mapper.saveCenter(centerDto);

         return centerDto;
    }

    @Override
    @Transactional
    public CenterDto deleteCenter(CenterDto centerDto)  {

        mapper.deleteCenter(centerDto);

        return centerDto;
    }

}
