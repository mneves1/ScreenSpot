package com.screenspot.Backend.service.Item;

import com.screenspot.Backend.entiry.Items.Item;
import com.screenspot.Backend.repository.Item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item getItem(int id) {
        Optional<Item> item = itemRepository.findById(id);
        return item.orElseThrow(() -> new RuntimeException("Item not found"));
    }

    // other methods for CRUD operations
}

