package com.ootcha.wms.service.outboundReq;



import com.ootcha.wms.dto.outboundReq.OutboundReqDeleteDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqSrchDto;
import com.ootcha.wms.dto.outboundReq.OutboundReqUpdateDto;
import com.ootcha.wms.mapper.outboundReq.OutboundReqMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OutboundReqServiceImpl implements OutboundReqService {

    private  final OutboundReqMapper mapper;

    @Override
    public List<OutboundReqDto> findOutboundReq(OutboundReqSrchDto outboundReqSrchDto){

        return mapper.findOutboundReq(outboundReqSrchDto);
    }

    @Override
    public List<OutboundReqDto> findOutboundReqList(OutboundReqSrchDto outboundReqDto){

        return mapper.findOutboundReqList(outboundReqDto);
    }

    @Override
    @Transactional
    public Integer saveOutboundReq(List<OutboundReqDto> outboundReqDto)  {

        mapper.saveOutboundReq(outboundReqDto.get(0));
        Integer outboundReqNo = outboundReqDto.get(0).getOutboundReqNo();

        if(outboundReqDto.get(0).getItemCd() != null) {

            String bizCd = outboundReqDto.get(0).getBizCd();
            String outboundReqDt = outboundReqDto.get(0).getOutboundReqDt();

            Map<Object, Object> paramMap = new HashMap<>();
            paramMap.put("bizCd", bizCd);
            paramMap.put("outboundReqDt", outboundReqDt);
            paramMap.put("outboundReqNo", outboundReqNo);
            paramMap.put("list", outboundReqDto);

            mapper.saveOutboundReqItem(paramMap);
        }
        return outboundReqNo;
    }

    @Override
    @Transactional
    public void deleteOutboundReq(OutboundReqDeleteDto outboundReqDeleteDto)  {

        mapper.deleteOutboundReq(outboundReqDeleteDto);
        mapper.deleteOutboundReqItem(outboundReqDeleteDto);

    }
    @Override
    public void deleteOutboundReqList(List<OutboundReqDeleteDto> outboundReqDeleteDto) {

        mapper.deleteOutboundReqList(outboundReqDeleteDto);


    }

    @Override
    @Transactional
    public OutboundReqUpdateDto updateOutboundAppr(List<OutboundReqUpdateDto> updateDto)  {

        for(int i=0; i<updateDto.size(); i++) {
            if(updateDto.get(i).getChecked() == 0){
                mapper.updateOutboundAppr(updateDto.get(i));
            }else{
                mapper.updateOutboundApprRefuse(updateDto.get(i));
            }
        }
        return null;
    }

}
