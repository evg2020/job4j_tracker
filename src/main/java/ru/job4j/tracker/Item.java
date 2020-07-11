package ru.job4j.tracker;

public class Item {
    public int id;
    public String name;

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
}