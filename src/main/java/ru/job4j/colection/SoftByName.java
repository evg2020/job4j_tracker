package ru.job4j.colection;

import java.util.Comparator;

public class SoftByName implements Comparator<User> {
    @Override
    public int compare(User first, User second) {
        return first.getName().compareTo(second.getName());
    }
}
