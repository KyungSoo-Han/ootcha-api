package com.ootcha.wms.api.customer;

import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.customer.CustomerDto;
import com.ootcha.wms.dto.customer.CustomerSrchDto;
import com.ootcha.wms.service.customer.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @GetMapping("/list")
    public ResponseDto<List<CustomerDto>> findCustomerList(@RequestParam String bizCd, String customerCd) {

        System.out.println(bizCd);
        System.out.println(customerCd);

        CustomerSrchDto forSelect = new CustomerSrchDto();
        forSelect.setBizCd(bizCd);
        forSelect.setCustomerCd(customerCd);

        List<CustomerDto> rtnData = customerService.findCustomerList(forSelect);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto<CustomerDto> saveCustomer(@RequestBody CustomerDto cusDto) throws CustomException {

        CustomerDto rtnData = customerService.saveCustomer(cusDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto<CustomerDto> deleteCustomer(@RequestBody CustomerDto cusDto) throws CustomException {

        CustomerDto rtnData = customerService.deleteCustomer(cusDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }


}
