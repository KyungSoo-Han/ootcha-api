package com.ootcha.wms.service.supplier;

import com.ootcha.wms.dto.supplier.SupplierDto;
import com.ootcha.wms.dto.supplier.SupplierSrchDto;

import java.util.List;

public interface SupplierService {
    List<SupplierDto> findSupplierList(SupplierSrchDto supplierSrchDto);

    public SupplierDto saveSupplier(SupplierDto supplierDto);

    SupplierDto deleteSupplier(SupplierDto supplierDto);
}
