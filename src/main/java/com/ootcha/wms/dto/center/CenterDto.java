package com.ootcha.wms.dto.center;

import lombok.Data;

@Data
public class CenterDto {

    private String bizCd;
    private String centerCd;
    private String centerNm;
    private String zipNo;
    private String zipAddr1;
    private String zipAddr2;
    private String remark;
    private String createdId;
    private String createdDt;
    private String modifiedId;
    private String modifiedDt;
}
