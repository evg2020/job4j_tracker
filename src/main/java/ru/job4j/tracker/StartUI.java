package ru.job4j.tracker;

public class StartUI  {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        Item item01 = new Item();
        item01.setName("Ivan");
        Item item02 = new Item();
        item02.setName("Petr");
        Item item03 = new Item();
        item03.setName("Slava");
        Item item04 = new Item();
        item03.setName("Vitalick");




        tracker.add(item01);
        tracker.add(item02);
        tracker.add(item03);

        tracker.findAll();

        System.out.println("Cписок заявок");

        for (int i = 0; i < tracker.findAll().length; i++) {
            System.out.println(tracker.getItems()[i].getName());
        }

        // метод findById и найденный Item выведите на консоль

        int findId = 3;
        System.out.println("метод findById = " + findId + " и найденный Item выведите на консоль");
        System.out.println(tracker.findById(findId).getName());
    }
}
