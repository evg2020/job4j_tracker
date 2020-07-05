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
        Item res = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                res = item;
                break;
            }
        }
        return res;
    }

    public Item[] findByName(String key) {
        Item[] fixname = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item.getName() == key) {
                fixname[i] = item;
            }
        }
        return fixname;
    }

    public Item[] findAll() {
        Item[] arrayFindAll = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name = items[i];
            if (name != null) {
                arrayFindAll[size] = name;
                size++;
            }
        }
       arrayFindAll = Arrays.copyOf(arrayFindAll, size);
        return arrayFindAll;
    }
}
