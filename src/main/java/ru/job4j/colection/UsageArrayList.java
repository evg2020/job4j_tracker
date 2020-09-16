package ru.job4j.colection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Vova");
        names.add("Pery");
        names.remove(1);
        names.set(0, "ddd");

        for (Object in : names) {
            System.out.println(in);
        }
    }
}
