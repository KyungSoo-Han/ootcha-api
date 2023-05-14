package com.ootcha.wms.mapper.biz;

import com.ootcha.wms.dto.biz.BizDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BizMapper {

    List<BizDto> findBizList(BizDto bizDto);

    void saveBiz(BizDto bizDto);

    void deleteBiz(BizDto bizDto);

}
