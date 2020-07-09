package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Replace02 {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        Item item01 = new Item();
        item01.setName("Ivan");
        Item item02 = new Item();
        item02.setName("Petr");
        Item item03 = new Item();
        item03.setName("Slava");
        Item item04 = new Item();
        item04.setName("Vitalick");


        tracker.add(item01);
        tracker.add(item02);
        tracker.add(item03);
        tracker.add(item04);

        tracker.findAll();

        System.out.println("Cписок заявок");

//        System.out.println(tracker.getItems()[0].getName());

        for (int i = 0; i < tracker.findAll().length; i++) {
            System.out.println(tracker.getItems()[i].getName());
        }

        // метод findById и найденный Item выведите на консоль

        int findId = 3;
        System.out.println("метод findById = " + findId + " и найденный Item выведите на консоль");
        System.out.println(tracker.findById(findId).getName());


// метод delete удаляет элемент
        int del = 4;
        tracker.delete(del);
        System.out.println();
        System.out.println("удален элемент с id = " + del );
        for (int i = 0; i < tracker.findAll().length; i++) {
            System.out.println(tracker.getItems()[i].getName());

        }

        System.out.println();
            String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor", "Vasia", "Vas"};
            String[] names02 = names;
            System.arraycopy(names, 2, names02, 1, 5);
            System.out.println(Arrays.toString(names02));


    }
}
