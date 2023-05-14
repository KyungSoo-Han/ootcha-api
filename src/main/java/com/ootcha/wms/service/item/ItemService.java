package com.ootcha.wms.service.item;

import com.ootcha.wms.dto.item.ItemDto;
import com.ootcha.wms.dto.item.ItemSrchDto;

import java.util.List;

public interface ItemService {
    List<ItemDto> findItemList(ItemSrchDto ItemDto);

    public ItemDto saveItem(ItemDto ItemDto);

    ItemDto deleteItem(ItemDto ItemDto);
}
