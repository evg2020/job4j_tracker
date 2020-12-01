package ru.job4j.colection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Lada");
        names.add("BMW");
        names.add("VOLVO");
        names.add("Lada");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
