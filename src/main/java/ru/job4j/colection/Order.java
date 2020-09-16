package ru.job4j.colection;

import java.util.Objects;

public class Order {
    private String number;
    private String name;

    public Order(String number, String name) {
    this.number = number;
    this.name = name;
    }

    public String getNumber() {
        return number;
    }

    @Override

    public boolean equals(Object o) {
         Order order = (Order) o;
        return number.equals(order.number)
                && name.equals(order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
