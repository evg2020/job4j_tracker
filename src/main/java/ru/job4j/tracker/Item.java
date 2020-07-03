package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item(){
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Item item01 = new Item();
        Item item02 = new Item(111);
        Item item03 = new Item(123, "Rus");
    }
}