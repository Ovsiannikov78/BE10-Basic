package de.ovsiannikov.springsimplemicroservice.controller;


import de.ovsiannikov.springsimplemicroservice.entity.Item;
import de.ovsiannikov.springsimplemicroservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/api/items")
    public void createItem(@RequestBody Item item) {
        itemService.createItem(item);
    }

    @GetMapping("/api/items")
    public List<Item> getItems() {
        return itemService.getItems();
    }
}