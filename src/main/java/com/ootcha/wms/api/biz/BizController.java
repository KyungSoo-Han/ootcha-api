package com.ootcha.wms.api.biz;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.biz.BizDto;
import com.ootcha.wms.service.biz.BizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.ootcha.wms.dto.common.ResponseDto;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/biz")
@RequiredArgsConstructor
public class BizController {

    private final BizService BizService;
    @GetMapping("/list")
    public ResponseDto<List<BizDto>> findBizList(@RequestParam String bizCd) {


        BizDto forSelect = new BizDto();
        forSelect.setBizCd(bizCd);

        List<BizDto> rtnData = BizService.findBizList(forSelect);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto<BizDto> saveBiz(@RequestBody BizDto bizDto) throws CustomException {

        BizDto rtnData = BizService.saveBiz(bizDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto<BizDto> deleteBiz(@RequestBody BizDto bizDto) throws CustomException {

        BizDto rtnData = BizService.deleteBiz(bizDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }


}
