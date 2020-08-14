package ru.job4j.colection.Job;
import java.util.Comparator;

public class JobDescByName implements Comparator<Job>{
    @Override
    public int compare(Job o01, Job o02) {
        return o01.getName().compareTo(o02.getName());
    }
}
