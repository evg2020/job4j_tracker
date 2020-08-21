package ru.job4j.colection;
import java.util.Comparator;

public class JobDescByPriority implements Comparator<Job> {
    @Override
    public  int compare(Job o01, Job o02) {
        return Integer.compare(o01.getPriority(), o02.getPriority());
    }
}
