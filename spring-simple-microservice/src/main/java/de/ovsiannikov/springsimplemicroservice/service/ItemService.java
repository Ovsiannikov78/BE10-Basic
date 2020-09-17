package de.ovsiannikov.springsimplemicroservice.service;

import de.ovsiannikov.springsimplemicroservice.entity.Item;
import de.ovsiannikov.springsimplemicroservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void createItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> getItems() {
        return itemRepository.findAll();
    }
}