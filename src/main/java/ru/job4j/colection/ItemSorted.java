package ru.job4j.colection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


@SuppressWarnings("checkstyle:WhitespaceAround")
public class ItemSorted {

    public List<Item> sort(List<Item> items) {
        Collections.sort(items);
        return items;
    }

    public  List<Item> sortReverse(List<Item> items) {
        Collections.sort(items, Collections.reverseOrder());
        return items;
    }

    public List<Item> sortByName(List<Item> items) {
        Collections.sort(items, new SortByNameItem());
        return items;
    }

    public List<Item> sortByNameReverse(List<Item> items) {
        Collections.sort(items, new SoftByNameReverse());
        return  items;
    }


    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(7, "Ivan"),
                new Item(3, "VAnya"),
                new Item(5, "ARoma")
        );

        System.out.println(items);

        Collections.sort(items);
        System.out.println(items);

        Collections.sort(items, new SortByNameItem());
        System.out.println(items);
        Collections.sort(items, new SoftByNameReverse());
        System.out.println(items);

        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);
    }

}

