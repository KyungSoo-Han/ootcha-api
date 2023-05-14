package com.ootcha.wms.api.location;
import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.location.LocationDto;
import com.ootcha.wms.dto.location.LocationSrchDto;
import com.ootcha.wms.service.location.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;
    @GetMapping("/list")
    public ResponseDto<List<LocationDto>> findLocationList(@RequestParam String bizCd, String centerCd) {


        LocationSrchDto forSelect = new LocationSrchDto();
        forSelect.setBizCd(bizCd);
        forSelect.setCenterCd(centerCd);

        List<LocationDto> rtnData = locationService.findLocationList(forSelect);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto <List<LocationDto>> saveLocation(@RequestBody List<LocationDto> locationDto) throws CustomException {

        List<LocationDto> rtnData = locationService.saveLocation(locationDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto<List<LocationDto>> deleteLocation(@RequestBody List<LocationDto> locationDto) throws CustomException {

        List<LocationDto> rtnData = locationService.deleteLocation(locationDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }


}
