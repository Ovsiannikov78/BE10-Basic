package de.ovsiannikov.springsimplemicroservice.controller;


import de.ovsiannikov.springsimplemicroservice.entity.Item;
import de.ovsiannikov.springsimplemicroservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public void createItem(@RequestBody Item item) {
        itemService.createItem(item);
    }

    @GetMapping()
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable long id) {
        return itemService.getItemById(id);
    }
}