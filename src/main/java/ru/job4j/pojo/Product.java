package ru.job4j.pojo;

import java.util.Objects;

public class Product {
    private String name;
    private int count;

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Product product = (Product) ob;
        return count == product.count &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }


    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

}