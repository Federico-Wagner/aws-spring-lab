package com.example.lab.lista.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
@Slf4j
public class ListaController {

    private final List<String> items = new ArrayList<>();

    @PostMapping
    public String addItem(@RequestBody String item) {
        items.add(item);
        log.info("Item agregado: {}", item);
        return "Item agregado: " + item;
    }

    @GetMapping
    public List<String> getItems() {
        return items;
    }
}