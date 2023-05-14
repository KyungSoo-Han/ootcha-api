package com.ootcha.wms.service.item;

import com.ootcha.wms.dto.item.ItemDto;
import com.ootcha.wms.dto.item.ItemSrchDto;
import com.ootcha.wms.mapper.item.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemMapper itemMapper;

    @Override
    public List<ItemDto> findItemList(ItemSrchDto ItemSrchDto) {

        return itemMapper.findItemList(ItemSrchDto);
    }

    @Transactional
    public ItemDto saveItem(ItemDto itemDto){

        itemDto.setCreatedId("sean");

        itemMapper.saveItem(itemDto);

        return itemDto;
    }

    @Override
    public ItemDto deleteItem(ItemDto itemDto) {

        itemMapper.deleteItem(itemDto);
        return null;
    }
}
