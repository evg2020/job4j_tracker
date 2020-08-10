package ru.job4j.colection;

import java.util.Comparator;

public class SoftByNameReverse implements Comparator<Item> {
    @Override

    public int compare(Item first, Item second) {
        return second.getName().compareTo(first.getName());
    }
}