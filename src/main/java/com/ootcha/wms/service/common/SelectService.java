package com.ootcha.wms.service.common;

import com.ootcha.wms.dto.common.SelectDto;
import com.ootcha.wms.mapper.common.SelectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SelectService {
    private final SelectMapper selectMapper;
    public List<SelectDto> searchSelect(String gbn, String bizCd, String parentCd, String param1, String param2, String param3){
        if(gbn.equals("customer")){
            return selectMapper.selectCustomer(bizCd);
        }
        else if (gbn.equals("supplier")){
            return selectMapper.selectSupplier(bizCd, parentCd);
        }
        else if (gbn.equals("destination")){
            return selectMapper.selectDestination(bizCd, parentCd);
        }
        else{
            return selectMapper.selectItem(bizCd, parentCd);
        }
    }

    public List<SelectDto> selectCustomer(String bizCd){
        return selectMapper.selectCustomer(bizCd);
    }
    public List<SelectDto> selectSupplier(String bizCd, String customerCd){
        return selectMapper.selectSupplier(bizCd, customerCd);
    }

    public List<SelectDto> selectCenter(String bizCd) {return selectMapper.selectCenter(bizCd);}

    public List<SelectDto> selectDestination(String bizCd, String customerCd) {return selectMapper.selectDestination(bizCd, customerCd);}
}
