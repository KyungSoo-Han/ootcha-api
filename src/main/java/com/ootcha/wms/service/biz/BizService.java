package com.ootcha.wms.service.biz;

import com.ootcha.wms.dto.biz.BizDto;

import java.util.List;

public interface BizService {

    List<BizDto> findBizList(BizDto bizDto);

    BizDto saveBiz(BizDto bizDto);

    BizDto deleteBiz(BizDto bizDto);
}
