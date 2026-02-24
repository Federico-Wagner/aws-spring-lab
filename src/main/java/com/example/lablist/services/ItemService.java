package com.example.lablist.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class ItemService {

    private final List<String> items = new ArrayList<>();

    public String add(String item) {
        items.add(item);
        log.info("Item added: {}", item);
        return "Item added: " + item;
    }

    public List<String> getAll() {
        return Collections.unmodifiableList(items);
    }

}

