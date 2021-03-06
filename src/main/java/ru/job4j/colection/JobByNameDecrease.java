package ru.job4j.colection;
import java.util.Collection;
import java.util.Comparator;

public class JobByNameDecrease implements Comparator<Job> {
    @Override
    public int compare(Job o01, Job o02) {
        return o02.getName().compareTo(o01.getName());
    }
}
