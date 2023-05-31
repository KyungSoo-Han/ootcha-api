package com.ootcha.wms.api.inboundinspect;

import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.inboundinsepect.InboundInspectDto;
import com.ootcha.wms.dto.inboundinsepect.InboundInspectSrchDto;
import com.ootcha.wms.dto.inboundreq.InboundReqDto;
import com.ootcha.wms.dto.inboundreq.InboundReqSrchDto;
import com.ootcha.wms.service.inboundinspect.InboundInspectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inboundinspect")
public class InboundInspectController {
    private final InboundInspectService inboundInspectService;

    @PostMapping("/list")
    public ResponseDto<List<InboundInspectDto>> findInboundReq(@RequestBody InboundInspectSrchDto inspectSrchDto) {

        List<InboundInspectDto> inboundInspectList = inboundInspectService.findInboundInspectList(inspectSrchDto);

        return ResponseDto.SuccessResponse(inboundInspectList, HttpStatus.OK);
    }

}
