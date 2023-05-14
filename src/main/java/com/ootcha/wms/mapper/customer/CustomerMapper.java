package com.ootcha.wms.mapper.customer;

import com.ootcha.wms.dto.customer.CustomerDto;
import com.ootcha.wms.dto.customer.CustomerSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    void saveCustomer(CustomerDto customerDto);

    List<CustomerDto> findCustomerList(CustomerSrchDto customerDto);

    void deleteCustomer(CustomerDto customerDto);
}
