package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Tracker {
    ArrayList<Item> items = new ArrayList<>();
//    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(size++, item);
//        items[size++] = item;
        return item;
    }

    public ArrayList findByName(String name) {
        ArrayList<Item> sameName = new ArrayList<>();
        int sizeNew = 0;
        for (Item same : items) {
            if (same.getName().contains(name)) {
                sameName.add(same);
            }
        }
        return sameName;
    }

    // возврат Списка
    public ArrayList<Item> findAll() {
        return  items;
    }

// возвращает индекc ячейки массива items при совпадени номера id
     private  int indexOf(int id) {
          int res = -1;
         for (Item same : items) {
             if (same.getId() == id) {
                 res = items.indexOf(same);
                 break;
             }
         }
         return res;
     }

// возвращает значение ячейки при совпадение id
     public Item findById(int id) {
        int index = indexOf(id);
        return (index != -1) ? items.get(index) : null;
     }

// заменяет ячейку
     public boolean replace(int id, Item item) {
        boolean res = false;
        int index = indexOf(id);
         if (index != -1) {
             item.setId(id);
             items.set(index, item);
             res = true;
                }
        return res;
     }

     public  boolean  delete(int id) {
         boolean res = false;
         int index = indexOf(id);
           if (items.remove(index) != null) {
               res = true;
           }

         return res;
     }

}
