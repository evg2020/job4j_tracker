package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Tracker {
    List<Item> items = new ArrayList<>();
//    private final Item[] items = new Item[100];
    private int ids = 1;


    public List<Item> getItems() {
        return items;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findByName(String name) {
        List<Item> sameName = new ArrayList<>();
        for (Item same : items) {
            if (same.getName().equals(name)) {
                sameName.add(same);
            }
        }
        return sameName;
    }

    // возврат Списка
    public List<Item> findAll() {
        return  items;
    }

// возвращает индекc ячейки массива items при совпадени номера id
     private  int indexOf(int id) {
          int res = -1;
         for (int i = 0; i < items.size(); i++) {
             if (items.get(i).getId() == id) {
                 res = i;
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
           if (index != -1) {
               items.remove(index);
               res = true;
           }

         return res;
     }

}
