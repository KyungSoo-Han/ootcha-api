package com.ootcha.wms.service.inboundReq;



import com.ootcha.wms.dto.inboundReq.*;
import com.ootcha.wms.mapper.inboundReq.InboundReqMapper;
import com.ootcha.wms.dto.inboundReq.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InboundReqServiceImpl implements InboundReqService {

    private  final InboundReqMapper mapper;

    @Override
    public List<InboundReqDto> findInboundReq(InboundReqSrchDto inboundReqSrchDto){

        return mapper.findInboundReq(inboundReqSrchDto);
    }

    @Override
    public List<InboundReqDto> findInboundReqList(InboundReqSrchDto inboundReqDto){

        return mapper.findInboundReqList(inboundReqDto);
    }

    @Override
    @Transactional
    public Integer saveInboundReq(List<InboundReqDto> inboundReqDto)  {

        mapper.saveInboundReq(inboundReqDto.get(0));
        Integer inboundReqNo = inboundReqDto.get(0).getInboundReqNo();

        if(inboundReqDto.get(0).getItemCd() != null) {

            String bizCd = inboundReqDto.get(0).getBizCd();
            String inboundReqDt = inboundReqDto.get(0).getInboundReqDt();

            Map<Object, Object> paramMap = new HashMap<>();
            paramMap.put("bizCd", bizCd);
            paramMap.put("inboundReqDt", inboundReqDt);
            paramMap.put("inboundReqNo", inboundReqNo);
            paramMap.put("list", inboundReqDto);

            mapper.saveInboundReqItem(paramMap);
        }
        return inboundReqNo;
    }

    @Override
    @Transactional
    public void deleteInboundReq(InboundReqDeleteDto inboundReqDeleteDto)  {

        mapper.deleteInboundReq(inboundReqDeleteDto);
        mapper.deleteInboundReqItem(inboundReqDeleteDto);

    }
    @Override
    public void deleteInboundReqList(List<InboundReqDeleteDto> inboundReqDeleteDto) {

        mapper.deleteInboundReqList(inboundReqDeleteDto);


    }

    @Override
    @Transactional
    public InboundReqUpdateDto updateInboundAppr(List<InboundReqUpdateDto> updateDto)  {

        for(int i=0; i<updateDto.size(); i++) {
            if(updateDto.get(i).getChecked() == 0){
                mapper.updateInboundAppr(updateDto.get(i));
            }else{
                mapper.updateInboundApprRefuse(updateDto.get(i));
            }
        }
        return null;
    }

    @Override
    public Integer saveInbound(List<InboundDto> inboundDto) {
        mapper.saveInbound(inboundDto.get(0));
        Integer inboundNo = inboundDto.get(0).getInboundNo();

        if(inboundDto.get(0).getItemCd() != null) {

            String bizCd = inboundDto.get(0).getBizCd();
            String inboundDt = inboundDto.get(0).getInboundDt();

            Map<Object, Object> paramMap = new HashMap<>();
            paramMap.put("bizCd", bizCd);
            paramMap.put("inboundDt", inboundDt);
            paramMap.put("inboundNo", inboundNo);
            paramMap.put("list", inboundDto);

            mapper.saveInboundItem(paramMap);
        }
        return inboundNo;
    }

    @Override
    public List<InboundDto> findInbound(InboundSrchDto inboundSrchDto) {

        return mapper.findInbound(inboundSrchDto);
    }

    @Override
    public List<InboundInspectDto> findInboundInspectList(InboundInspectSrchDto inboundInspectSrchDto) {

        return mapper.findInboundInspectList(inboundInspectSrchDto);
    }

    @Override
    public InboundInspectDto saveInboundInspect(List<InboundInspectDto> inboundInspectDto) {

        mapper.saveInboundInspect(inboundInspectDto);

        return null;
    }

    @Override
    public InboundInspectDeleteDto deleteInboundInspect(List<InboundInspectDeleteDto> inboundInspectDeleteDto) {

        mapper.deleteInboundInspect(inboundInspectDeleteDto);

        return null;
    }

    @Override
    public InboundDeleteDto deleteInbound(List<InboundDeleteDto> inboundDeleteDto) {

        mapper.deleteInbound(inboundDeleteDto);
        mapper.deleteInboundItem(inboundDeleteDto);

        return null;
    }


}
