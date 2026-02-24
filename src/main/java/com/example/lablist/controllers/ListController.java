package com.example.lablist.controllers;


import com.example.lablist.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@Slf4j
public class ListController {

    private final ItemService ItemService;

    public ListController(ItemService itemService) {
        this.ItemService = itemService;
    }

    @PostMapping
    public ResponseEntity<String> addItem(@RequestBody String item) {
        String response = ItemService.add(item);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<String>> getItems() {
        return ResponseEntity.ok(ItemService.getAll());
    }

}