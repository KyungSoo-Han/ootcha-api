package com.ootcha.wms.service.customer;

import com.ootcha.wms.dto.customer.CustomerDto;
import com.ootcha.wms.dto.customer.CustomerSrchDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> findCustomerList(CustomerSrchDto customerDto);

    public CustomerDto saveCustomer(CustomerDto customerDto);

    CustomerDto deleteCustomer(CustomerDto cusDto);
}
