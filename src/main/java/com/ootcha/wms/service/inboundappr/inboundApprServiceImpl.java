package com.ootcha.wms.service.inboundappr;

import com.ootcha.wms.dto.inboundreq.InboundReqDto;
import com.ootcha.wms.dto.inboundreq.InboundReqSrchDto;
import com.ootcha.wms.mapper.inboundappr.InboundApprMapper;
import com.ootcha.wms.mapper.inboundreq.InboundReqMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class inboundApprServiceImpl implements InboundApprService{

    private  final InboundApprMapper mapper;

    @Override
    public List<InboundReqDto> findInboundReqMst(InboundReqSrchDto inboundReqSrchDto) {
        return mapper.findInboundReqMst(inboundReqSrchDto);
    }

    @Override
    public List<InboundReqDto> findInboundReqDtl(InboundReqSrchDto inboundReqSrchDto) {
        return mapper.findInboundReqDtl(inboundReqSrchDto);
    }
}
