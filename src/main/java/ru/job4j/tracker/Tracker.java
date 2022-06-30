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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        size = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null
                    && items[index].getName().equals(key)) {
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

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index > -1) {
            int oldId = items[index].getId();
            items[index] = item;
            items[index].setId(oldId);
            return true;
        }
        return false;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index > -1) {
            int length = size - index - 1;
            System.arraycopy(items, index + 1, items, index, length);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }
}
