package com.ootcha.wms.api.supplier;
import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.supplier.SupplierDto;
import com.ootcha.wms.dto.supplier.SupplierSrchDto;
import com.ootcha.wms.service.supplier.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/supplier")
@RequiredArgsConstructor
public class SupplierController {

    private final SupplierService supplierService;
    @GetMapping("/list")
    public ResponseDto<List<SupplierDto>> findSupplierList(@RequestParam String bizCd, String customerCd, String supplierCd) {


        SupplierSrchDto forSelect = new SupplierSrchDto();
        forSelect.setBizCd(bizCd);
        forSelect.setCustomerCd(customerCd);
        forSelect.setSupplierCd(supplierCd);

        List<SupplierDto> rtnData = supplierService.findSupplierList(forSelect);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto<SupplierDto> saveSupplier(@RequestBody SupplierDto supplierDto) throws CustomException {

        SupplierDto rtnData = supplierService.saveSupplier(supplierDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto<SupplierDto> deleteSupplier(@RequestBody SupplierDto supplierDto) throws CustomException {

        SupplierDto rtnData = supplierService.deleteSupplier(supplierDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }


}
