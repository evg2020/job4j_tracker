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

     private  int indexOf(int id) {
        int res = 1;
         for (int i = 0; i < size; i++) {
             if (items[i].getId() == id) {
                 res = i;
                 break;
             }
         }
         return res;
     }

     public Item findById(int id) {
        int index = indexOf(id);
        return (index!=-1) ? items[index] : null;
     }

     public boolean replace(int id, Item item) {
        boolean res = false;
        int index = indexOf(id);
        items[index].setName(item.getName());
         if (items[index].equals(item.getName())) {
             res = true;
             }
        return res;
     }

     public  boolean  delete(int id) {

         int index = indexOf(id);
         items[index] = null;
         System.arraycopy(items,index +1,items,index , size - index);
         items[size-1] = null;
         size--;
         return true;
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
