package ru.job4j.tracker;

import java.util.Arrays;

public class TrackerOld {
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

    public Item[] findByName(String name) {
        Item[] sameName = new Item[size];
        int sizeNew = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(name)) {
                sameName[sizeNew] = item;
                sizeNew++;
            }
        }
        return Arrays.copyOf(sameName, sizeNew); // возврат нового масива с уменьшенной длинной
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size); // возврат нового масива с уменьшенной длинной
    }

    // возвращает индек ячейки массива items при совпадени номера id
    private int indexOf(int id) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                res = i;
                break;
            }
        }
        return res;
    }
// возвращает значение ячейки при совпадение id

    public Item findById(int id) {
        int index = indexOf(id);
        return (index != -1) ? items[index] : null;
    }
// заменяет

    public boolean replace(int id, Item item) {
        boolean res = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            res = true;
        }
        return res;
    }

    public boolean delete(int id) {
        boolean res = false;
        int index = indexOf(id);
        items[index] = null;
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            res = true;
        }
        return res;
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
