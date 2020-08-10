package ru.job4j.colection;

public class Item implements Comparable<Item> {
    public int id;
    public String name;


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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}