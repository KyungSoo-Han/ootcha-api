package com.ootcha.wms.mapper.common;

import com.ootcha.wms.dto.common.SelectDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SelectMapper {
    List<SelectDto> selectModal(String gbn , String param1, String param2, String param3, String param4, String param5);

    List<SelectDto> selectCustomer(String bizCd);
    List<SelectDto> selectItem(String bizCd, String customerCd);
    List<SelectDto> selectSupplier(String bizCd, String customerCd);

    List<SelectDto> selectCenter(String bizCd);

    List<SelectDto> selectDestination(String bizCd, String customerCd);
}
