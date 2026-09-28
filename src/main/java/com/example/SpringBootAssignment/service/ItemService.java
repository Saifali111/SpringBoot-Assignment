package com.example.SpringBootAssignment.service;

import com.example.SpringBootAssignment.entity.Item;
import com.example.SpringBootAssignment.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    public Item getItemById(Long id){
        return itemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Item not found with id : " + id));
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public void deleteItemById(Long id){
        itemRepository.deleteById(id);
    }
}
