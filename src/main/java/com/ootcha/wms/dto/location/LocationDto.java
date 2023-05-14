package com.ootcha.wms.dto.location;

import lombok.Data;

@Data
public class LocationDto {
    private String bizCd;
    private String centerCd;
    private String locationCd;
    private String zoneCd;
    private String locationNm;
    private String locationType;
    private int ableCbm;
    private int ableWeight;
    private int locX;
    private int locY;
    private int locZ;
    private String useYn;
    private String createdId;
    private String createdDt;
    private String modifiedId;
    private String modifiedDt;


}
