package com.ootcha.wms.api.center;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.center.CenterDto;
import com.ootcha.wms.dto.center.CenterSrchDto;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.service.center.CenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/center")
@RequiredArgsConstructor
public class CenterController {

    private final CenterService centerService;
    @GetMapping("/list")
    public ResponseDto<List<CenterDto>> findCenterList(@RequestParam String bizCd) {


        CenterSrchDto forSelect = new CenterSrchDto();
        forSelect.setBizCd(bizCd);

        List<CenterDto> rtnData = centerService.findCenterList(forSelect);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto<CenterDto> saveBiz(@RequestBody CenterDto centerDto) throws CustomException {

        CenterDto rtnData = centerService.saveCenter(centerDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto<CenterDto> deleteBiz(@RequestBody CenterDto centerDto) throws CustomException {

        CenterDto rtnData = centerService.deleteCenter(centerDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }


}
