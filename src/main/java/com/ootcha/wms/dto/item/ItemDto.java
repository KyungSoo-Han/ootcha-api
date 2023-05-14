package com.ootcha.wms.dto.item;

import lombok.Data;

@Data
public class ItemDto {

    private String bizCd;
    private String customerCd;
    private String itemCd;
    private String itemNm;
    private String itemSnm;
    private String supplierCd;
    private String description;
    private int fromMakeDay;
    private String isMakeDay;
    private String isSet;
    private String location;
    private int nearExpDay;
    private int nonDeliverDay;
    private int safeStockQty;
    private String itemBarcode;
    private int itemWidth;
    private int itemDepth;
    private int itemHeight;
    private int itemWeight;
    private String caseBarcode;
    private int caseEaQty;
    private int caseWidth;
    private int caseDepth;
    private int caseHeight;
    private int caseWeight;
    private String boxBarcode;
    private int boxEaQty;
    private int boxWidth;
    private int boxDepth;
    private int boxHeight;
    private int boxWeight;
    private String palletBarcode;
    private int palletEaQty;
    private int palletWidth;
    private int palletDepth;
    private int palletHeight;
    private int palletWeight;
    private String status;
    private String createdId;
    private String createdDt;
    private String modifiedDt;
    private String modifiedId;


    
    
    
    
    
}
