package com.ootcha.wms.service.biz;

import com.ootcha.wms.dto.biz.BizDto;
import com.ootcha.wms.mapper.biz.BizMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BizServiceImpl implements BizService {

    private  final BizMapper mapper;

    @Override
    public List<BizDto> findBizList(BizDto bizDto){

            System.out.println(mapper.findBizList(bizDto));

        return mapper.findBizList(bizDto);
    }

    @Override
    @Transactional
    public BizDto saveBiz(BizDto bizDto)  {

        bizDto.setCreatedId("sean");

         mapper.saveBiz(bizDto);

         return bizDto;
    }

    @Override
    @Transactional
    public BizDto deleteBiz(BizDto bizDto)  {

        mapper.deleteBiz(bizDto);

        return bizDto;
    }

}
