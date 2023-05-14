package com.ootcha.wms.mapper.supplier;

import com.ootcha.wms.dto.supplier.SupplierDto;
import com.ootcha.wms.dto.supplier.SupplierSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierMapper {

    void saveSupplier(SupplierDto supplierDto);

    List<SupplierDto> findSupplierList(SupplierSrchDto supplierSrchDto);

    void deleteSupplier(SupplierDto supplierDto);
}
