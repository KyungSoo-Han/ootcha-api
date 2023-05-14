package com.ootcha.wms.dto.customer;

import lombok.Data;

@Data
public class CustomerDto {
    private String bizCd;
    private String customerCd;
    private String customerNm;
    private String customerEnm;
    private String ownerNm;
    private String bizNo;
    private String bizItem;
    private String bizType;
    private String email;
    private String telNo;
    private String faxNo;
    private String zipNo;
    private String zipAddr1;
    private String zipAddr2;
    private String homepage;
    private String status;
    private String createdId;
    private String createdDt;
    private String modifiedId;
    private String modifiedDt;


}
