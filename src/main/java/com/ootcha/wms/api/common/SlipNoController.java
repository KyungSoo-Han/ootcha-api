package com.ootcha.wms.api.common;

import com.ootcha.wms.dto.common.SlipNoDto;
import com.ootcha.wms.service.common.SlipNoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/api/slipno")
@RequiredArgsConstructor
@RestController
public class SlipNoController {

    private final SlipNoService slipNoService;

    @GetMapping
    public String getSlipNo (SlipNoDto slipNoDto){
        return slipNoService.getSlipNo(slipNoDto);
    }
}
