package com.ootcha.wms.api.outboundreq;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqDeleteDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqSrchDto;
import com.ootcha.wms.dto.outboundreq.OutboundReqUpdateDto;
import com.ootcha.wms.service.outboundreq.OutboundReqService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/outboundReq")
@RequiredArgsConstructor
public class OutboundReqController {

    private final OutboundReqService outboundReqService;
    @PostMapping("/get")
    public ResponseDto<List<OutboundReqDto>> findOutboundReq(@RequestBody OutboundReqSrchDto outboundReqSrchDto) {

        List<OutboundReqDto> outboundReqDto = outboundReqService.findOutboundReq(outboundReqSrchDto);

        return ResponseDto.SuccessResponse(outboundReqDto, HttpStatus.OK);
    }

    @PostMapping("/list")
    public ResponseDto<List<OutboundReqDto>> findOutboundReqList(@RequestBody OutboundReqSrchDto outboundReqSrchDto) {

        List<OutboundReqDto> outboundReqDto = outboundReqService.findOutboundReqList(outboundReqSrchDto);

        return ResponseDto.SuccessResponse(outboundReqDto, HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseDto<List<OutboundReqDto>> saveOutboundReq(@RequestBody List<OutboundReqDto> outboundReqDto) throws CustomException {

        Integer outboundReqNo = outboundReqService.saveOutboundReq(outboundReqDto);

        OutboundReqSrchDto outboundReqSrchDto = new OutboundReqSrchDto();
        outboundReqSrchDto.setBizCd(outboundReqDto.get(0).getBizCd());
        outboundReqSrchDto.setCenterCd(outboundReqDto.get(0).getCenterCd());
        outboundReqSrchDto.setOutboundReqDt(outboundReqDto.get(0).getOutboundReqDt());
        outboundReqSrchDto.setOutboundReqNo(outboundReqNo);

        List<OutboundReqDto> outboundReq = outboundReqService.findOutboundReq(outboundReqSrchDto);

        return ResponseDto.SuccessResponse(outboundReq, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseDto <OutboundReqDeleteDto> deleteOutboundReq(@RequestBody OutboundReqDeleteDto outboundReqDeleteDto) throws CustomException {

        outboundReqService.deleteOutboundReq(outboundReqDeleteDto);

        return ResponseDto.SuccessResponse(outboundReqDeleteDto, HttpStatus.OK);
    }


    @DeleteMapping("/delete/list")
    public ResponseDto <List<OutboundReqDeleteDto>> deleteOutboundReqList(@RequestBody List<OutboundReqDeleteDto> outboundReqDeleteDto) throws CustomException {

        outboundReqService.deleteOutboundReqList(outboundReqDeleteDto);

        return ResponseDto.SuccessResponse(outboundReqDeleteDto, HttpStatus.OK);
    }

    @PostMapping("/appr")
    public ResponseDto<OutboundReqUpdateDto> updateOutBoundAppr(@RequestBody List<OutboundReqUpdateDto> updateDto) {

        OutboundReqUpdateDto outboundReqDto = outboundReqService.updateOutboundAppr(updateDto);

        return ResponseDto.SuccessResponse(outboundReqDto, HttpStatus.OK);
    }
}
