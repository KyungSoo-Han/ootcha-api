package com.ootcha.wms.api.zone;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.zone.ZoneDto;
import com.ootcha.wms.dto.zone.ZoneSrchDto;
import com.ootcha.wms.service.zone.ZoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/zone")
@RequiredArgsConstructor
public class ZoneController {

    private final ZoneService zoneService;
    @GetMapping("/list")
    public ResponseDto<List<ZoneDto>> findZoneList(@RequestParam String bizCd, String centerCd, String stageYn) {


        ZoneSrchDto forSelect = new ZoneSrchDto();
        forSelect.setBizCd(bizCd);
        forSelect.setCenterCd(centerCd);
        forSelect.setStageYn(stageYn);

        List<ZoneDto> rtnData = zoneService.findZoneList(forSelect);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto<List<ZoneDto>> saveZone(@RequestBody List<ZoneDto> zoneDto) throws CustomException {

        List<ZoneDto> rtnData = zoneService.saveZone(zoneDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto <List<ZoneDto>> deleteZone(@RequestBody List<ZoneDto> zoneDto) throws CustomException {

        List<ZoneDto> rtnData = zoneService.deleteZone(zoneDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }


}
