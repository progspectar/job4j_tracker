package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        size = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null && items[index].getName().equals(key)) {
                rsl[size++] = items[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        size = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                rsl[size++] = items[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
