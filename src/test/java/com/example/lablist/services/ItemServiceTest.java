package com.example.lablist.services;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {

    @Test
    void shouldAddItem() {

        ItemService service = new ItemService();

        service.add("Apple");

        List<String> result = service.getAll();

        assertEquals(1, result.size());
        assertEquals("Apple", result.getFirst());
    }

    @Test
    void shouldReturnEmptyListInitially() {

        ItemService service = new ItemService();

        assertTrue(service.getAll().isEmpty());
    }
}