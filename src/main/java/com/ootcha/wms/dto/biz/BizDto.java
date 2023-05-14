package com.ootcha.wms.dto.biz;

import lombok.Data;

@Data
public class BizDto {

    private String bizCd;
    private String bizNm;
    private String bizEnm;
    private String bizNo;
    private String ownerNm;
    private String bizItem;
    private String bizType;
    private String zipNo;
    private String zipAddr1;
    private String zipAddr2;
    private String createdId;
    private String createdDt;
    private String modifiedDt;
    private String modifiedId;

}
