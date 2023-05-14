package com.ootcha.wms.api.common;

import com.ootcha.wms.dto.common.SelectDto;
import com.ootcha.wms.service.common.SelectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/api/select")
@RequiredArgsConstructor
@RestController
public class SelectController {
    private final SelectService selectService;

    @GetMapping("/modal/{bizCd}/{gbn}")
    public List<SelectDto> searchSelect(
                                        @PathVariable String bizCd, @PathVariable String gbn,
                                        @RequestParam(required = false, defaultValue = "") String parentCd,
                                        @RequestParam(required = false, defaultValue = "") String param1,
                                        @RequestParam(required = false, defaultValue = "") String param2,
                                        @RequestParam(required = false, defaultValue = "") String param3){
        System.out.println("bizCd = " + bizCd);
        System.out.println("gbn = " + gbn);
        System.out.println("parentCd = " + parentCd);
        return selectService.searchSelect(gbn, bizCd, parentCd, param1, param2, param3);
    }

    @GetMapping("/customer/{bizCd}")
    public List<SelectDto> selectCustomer(@PathVariable String bizCd){
        return selectService.selectCustomer(bizCd);
    }
    @GetMapping("/supplier/{bizCd}/{customerCd}")
    public List<SelectDto> selectSupplier(@PathVariable String bizCd,@PathVariable String customerCd){
        return selectService.selectSupplier(bizCd, customerCd);
    }
    @GetMapping("/destination/{bizCd}/{customerCd}")
    public List<SelectDto> selectDestination(@PathVariable String bizCd,@PathVariable String customerCd){
        return selectService.selectDestination(bizCd, customerCd);
    }
    @GetMapping("/center/{bizCd}")
    public List<SelectDto> selectCenter(@PathVariable String bizCd){
        return selectService.selectCenter(bizCd);
    }

}
