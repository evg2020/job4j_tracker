package ru.job4j.colection.Job;

import java.util.Comparator;

public class JobDescByPriorityDecrease implements Comparator<Job> {
    @Override
    public  int compare(Job o01, Job o02) {
        return Integer.compare(o02.getPriority(), o01.getPriority());
    }
}
