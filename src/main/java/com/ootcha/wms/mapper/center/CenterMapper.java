package com.ootcha.wms.mapper.center;

import com.ootcha.wms.dto.center.CenterDto;
import com.ootcha.wms.dto.center.CenterSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CenterMapper {

    List<CenterDto> findCenterList(CenterSrchDto centerDto);

    void saveCenter(CenterDto centerDto);

    void deleteCenter(CenterDto centerDto);

}
