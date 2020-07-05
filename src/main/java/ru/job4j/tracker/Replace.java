package ru.job4j.tracker;

public class Replace {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        Item item01 = new Item();
        item01.setName("Ivan");
        Item item02 = new Item();
        item01.setName("Petr");

        tracker.add(item01);
        tracker.add(item01);

        System.out.println(tracker[1].length);
    }
}


