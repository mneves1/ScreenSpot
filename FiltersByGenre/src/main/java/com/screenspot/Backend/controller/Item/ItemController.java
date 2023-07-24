package com.screenspot.Backend.controller.Item;

import com.screenspot.Backend.entiry.Items.Item;
import com.screenspot.Backend.service.Item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PutMapping("/items/{id}")
    public Item createItem(@PathVariable int id, @RequestBody Item item) {
        item.setId(id); // set the item id from path variable
        return itemService.createItem(item);
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable int id) {
        return itemService.getItem(id);
    }
}

