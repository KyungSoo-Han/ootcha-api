package com.ootcha.wms.api.inbound;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.inbound.InboundDto;
import com.ootcha.wms.dto.inbound.InboundSrchDto;
import com.ootcha.wms.dto.inboundreq.InboundReqDto;
import com.ootcha.wms.dto.inboundreq.InboundReqSrchDto;
import com.ootcha.wms.service.inbound.InboundService;
import com.ootcha.wms.service.inboundreq.InboundReqService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/inbound")
@RequiredArgsConstructor
public class InboundController {
    private final InboundService inboundService;
    @PostMapping("/mst")
    public ResponseDto<List<InboundDto>> findInboundMst(@RequestBody InboundSrchDto inboundSrchDto) {

        List<InboundDto> inboundDto = inboundService.findInboundMst(inboundSrchDto);

        return ResponseDto.SuccessResponse(inboundDto, HttpStatus.OK);
    }
    @PostMapping("/dtl")
    public ResponseDto<List<InboundDto>> findInboundDtl(@RequestBody InboundSrchDto inboundSrchDto) {

        List<InboundDto> inboundDto = inboundService.findInboundDtl(inboundSrchDto);

        return ResponseDto.SuccessResponse(inboundDto, HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseDto<String> saveInboundReq(@RequestBody List<InboundDto> inboundDto) throws CustomException {

        inboundService.saveInbound(inboundDto);


        return ResponseDto.SuccessResponse("OK", HttpStatus.OK);
    }
}
