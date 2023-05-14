package com.ootcha.wms.api.inboundReq;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.inboundReq.*;
import com.ootcha.wms.dto.inboundReq.*;
import com.ootcha.wms.service.inboundReq.InboundReqService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/inboundReq")
@RequiredArgsConstructor
public class InboundReqController {

    private final InboundReqService inboundReqService;
    @PostMapping("/get")
    public ResponseDto<List<InboundReqDto>> findInboundReq(@RequestBody InboundReqSrchDto inboundReqSrchDto) {

        List<InboundReqDto> inboundReqDto = inboundReqService.findInboundReq(inboundReqSrchDto);

        return ResponseDto.SuccessResponse(inboundReqDto, HttpStatus.OK);
    }

    @PostMapping("/list")
    public ResponseDto<List<InboundReqDto>> findInboundReqList(@RequestBody InboundReqSrchDto inboundReqSrchDto) {

        List<InboundReqDto> inboundReqDto = inboundReqService.findInboundReqList(inboundReqSrchDto);

        return ResponseDto.SuccessResponse(inboundReqDto, HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseDto<List<InboundReqDto>> saveInboundReq(@RequestBody List<InboundReqDto> inboundReqDto) throws CustomException {

        Integer inboundReqNo = inboundReqService.saveInboundReq(inboundReqDto);

        InboundReqSrchDto inboundReqSrchDto = new InboundReqSrchDto();
        inboundReqSrchDto.setBizCd(inboundReqDto.get(0).getBizCd());
        inboundReqSrchDto.setCenterCd(inboundReqDto.get(0).getCenterCd());
        inboundReqSrchDto.setInboundReqDt(inboundReqDto.get(0).getInboundReqDt());
        inboundReqSrchDto.setInboundReqNo(inboundReqNo);

        List<InboundReqDto> inboundReq = inboundReqService.findInboundReq(inboundReqSrchDto);

        return ResponseDto.SuccessResponse(inboundReq, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseDto <InboundReqDeleteDto> deleteInboundReq(@RequestBody InboundReqDeleteDto inboundReqDeleteDto) throws CustomException {

        inboundReqService.deleteInboundReq(inboundReqDeleteDto);

        return ResponseDto.SuccessResponse(inboundReqDeleteDto, HttpStatus.OK);
    }


    @DeleteMapping("/delete/list")
    public ResponseDto <List<InboundReqDeleteDto>> deleteInboundReqList(@RequestBody List<InboundReqDeleteDto> inboundReqDeleteDto) throws CustomException {

        inboundReqService.deleteInboundReqList(inboundReqDeleteDto);

        return ResponseDto.SuccessResponse(inboundReqDeleteDto, HttpStatus.OK);
    }

    @PostMapping("/appr")
    public ResponseDto<InboundReqUpdateDto> updateInBoundAppr(@RequestBody List<InboundReqUpdateDto> updateDto) {

        InboundReqUpdateDto inboundReqDto = inboundReqService.updateInboundAppr(updateDto);

        return ResponseDto.SuccessResponse(inboundReqDto, HttpStatus.OK);
    }

    @PostMapping("/saveInbound")
    public ResponseDto<List<InboundDto>> saveInbound(@RequestBody List<InboundDto> inboundDto) throws CustomException {

        Integer inboundNo = inboundReqService.saveInbound(inboundDto);

        InboundSrchDto inboundSrchDto = new InboundSrchDto();
        inboundSrchDto.setBizCd(inboundDto.get(0).getBizCd());
        inboundSrchDto.setCenterCd(inboundDto.get(0).getCenterCd());
        inboundSrchDto.setInboundDt(inboundDto.get(0).getInboundReqDt());
        inboundSrchDto.setInboundNo(inboundNo);

        List<InboundDto> inboundReq = inboundReqService.findInbound(inboundSrchDto);

        return ResponseDto.SuccessResponse(inboundReq, HttpStatus.OK);
    }

    @PostMapping("/InboundDelete")
    public ResponseDto<InboundDeleteDto> deleteInbound(@RequestBody List<InboundDeleteDto> inboundDeleteDto) throws CustomException {

        InboundDeleteDto inboundDelete = inboundReqService.deleteInbound(inboundDeleteDto);

        return ResponseDto.SuccessResponse(inboundDelete, HttpStatus.OK);
    }

    @PostMapping("/inspectList")
    public ResponseDto<List<InboundInspectDto>> findInboundInspectList(@RequestBody InboundInspectSrchDto inboundInspectSrchDto) throws CustomException {

        List<InboundInspectDto> inboundInspectReqDto = inboundReqService.findInboundInspectList(inboundInspectSrchDto);

        return ResponseDto.SuccessResponse(inboundInspectReqDto, HttpStatus.OK);
    }


    @PostMapping("inspectComplete")
    public ResponseDto<InboundInspectDto> saveInboundInspect(@RequestBody List<InboundInspectDto> inboundInspectDto) throws CustomException {

        InboundInspectDto inboundInspectReq = inboundReqService.saveInboundInspect(inboundInspectDto);
        
        return ResponseDto.SuccessResponse(inboundInspectReq, HttpStatus.OK);
    }

    @PostMapping("/InspectDelete")
    public ResponseDto<InboundInspectDeleteDto> deleteInboundInspect(@RequestBody List<InboundInspectDeleteDto> inboundInspectDeleteDto) throws CustomException {

        InboundInspectDeleteDto inboundInspectDelete = inboundReqService.deleteInboundInspect(inboundInspectDeleteDto);

        return ResponseDto.SuccessResponse(inboundInspectDelete, HttpStatus.OK);
    }
}
