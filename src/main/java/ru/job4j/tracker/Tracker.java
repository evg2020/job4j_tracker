package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item[] getItems() {
        return items;
    }

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
        Item[] sameName = new Item[size];
        int nameFix = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                sameName[i] = item;
                nameFix++;
            }
        }
        return Arrays.copyOf(sameName, nameFix);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }
}

// тот же метод но длиннее
    /*public Item[] findAll() {
        Item[] arrayFindAll = new Item[size];
        int size = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name != null) {
                arrayFindAll[size] = name;
                size++;
            }
        }
       arrayFindAll = Arrays.copyOf(arrayFindAll, size);
        return arrayFindAll;
    }
}*/
