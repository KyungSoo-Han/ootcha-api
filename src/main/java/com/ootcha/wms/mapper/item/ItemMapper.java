package com.ootcha.wms.mapper.item;

import com.ootcha.wms.dto.item.ItemDto;
import com.ootcha.wms.dto.item.ItemSrchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

    void saveItem(ItemDto ItemDto);

    List<ItemDto> findItemList(ItemSrchDto ItemDto);

    void deleteItem(ItemDto ItemDto);
}
