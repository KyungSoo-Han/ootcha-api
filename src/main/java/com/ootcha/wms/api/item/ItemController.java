package com.ootcha.wms.api.item;
import com.ootcha.wms.config.CustomException;
import com.ootcha.wms.dto.common.ResponseDto;
import com.ootcha.wms.dto.item.ItemDto;
import com.ootcha.wms.dto.item.ItemSrchDto;
import com.ootcha.wms.service.item.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/list")
    public ResponseDto<List<ItemDto>> findItemList(@RequestParam String bizCd, String customerCd, String itemCd) {


        ItemSrchDto forSelect = new ItemSrchDto();
        forSelect.setBizCd(bizCd);
        forSelect.setCustomerCd(customerCd);
        forSelect.setItemCd(itemCd);

        List<ItemDto> rtnData = itemService.findItemList(forSelect);
        String test = "TEST11";
        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseDto<ItemDto> saveItem(@RequestBody ItemDto itemDto) throws CustomException {

        ItemDto rtnData = itemService.saveItem(itemDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseDto<ItemDto> deleteItem(@RequestBody ItemDto itemDto) throws CustomException {

        ItemDto rtnData = itemService.deleteItem(itemDto);

        return ResponseDto.SuccessResponse(rtnData, HttpStatus.OK);
    }


}
