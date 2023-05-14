package com.ootcha.wms.service.supplier;



import com.ootcha.wms.dto.supplier.SupplierDto;
import com.ootcha.wms.dto.supplier.SupplierSrchDto;
import com.ootcha.wms.mapper.supplier.SupplierMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    private final SupplierMapper supplierMapper;

    @Override
    public List<SupplierDto> findSupplierList(SupplierSrchDto supplierSrchDto) {

        return supplierMapper.findSupplierList(supplierSrchDto);
    }

    @Transactional
    public SupplierDto saveSupplier(SupplierDto supplierDto){

        supplierDto.setCreatedId("sean");

        supplierMapper.saveSupplier(supplierDto);

        return supplierDto;
    }

    @Override
    public SupplierDto deleteSupplier(SupplierDto supplierDto) {

        supplierMapper.deleteSupplier(supplierDto);
        return null;
    }
}
