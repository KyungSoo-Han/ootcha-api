package com.ootcha.wms.service.customer;


import com.ootcha.wms.dto.customer.CustomerDto;
import com.ootcha.wms.dto.customer.CustomerSrchDto;
import com.ootcha.wms.mapper.customer.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerMapper customerMapper;

    @Override
    public List<CustomerDto> findCustomerList(CustomerSrchDto customerDto) {

        return customerMapper.findCustomerList(customerDto);
    }

    @Transactional
    public CustomerDto saveCustomer(CustomerDto customerDto){

        customerDto.setCreatedId("sean");

        customerMapper.saveCustomer(customerDto);

        return customerDto;
    }

    @Override
    public CustomerDto deleteCustomer(CustomerDto customerDto) {

        customerMapper.deleteCustomer(customerDto);
        return null;
    }
}
