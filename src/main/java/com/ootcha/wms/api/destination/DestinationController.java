package com.ootcha.wms.api.destination;
import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.destination.DestinationDto;
import com.ootcha.wms.dto.destination.DestinationSrchDto;
import com.ootcha.wms.service.destination.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/destination")
@RequiredArgsConstructor
public class DestinationController {

    private final DestinationService destinationService;
    @GetMapping("/list")
    public ResponseDto<List<DestinationDto>> findDestinationList(@RequestParam String bizCd, String customerCd, String destinationCd) {


        DestinationSrchDto forSelect = new DestinationSrchDto();
        forSelect.setBizCd(bizCd);
        forSelect.setCustomerCd(customerCd);
        forSelect.setDestinationCd(destinationCd);

        List<DestinationDto> rtnData = destinationService.findDestinationList(forSelect);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto<DestinationDto> saveDestination(@RequestBody DestinationDto destinationDto) throws CustomException {

        DestinationDto rtnData = destinationService.saveDestination(destinationDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto<DestinationDto> deleteDestination(@RequestBody DestinationDto destinationDto) throws CustomException {

        DestinationDto rtnData = destinationService.deleteDestination(destinationDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

}
