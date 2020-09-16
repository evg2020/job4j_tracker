package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private int id;
    private String name;

    public Item() {
            }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override

    public boolean equals(Object o) {
        Item item = (Item) o;
        return id == item.id
                &&  name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}