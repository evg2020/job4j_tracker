package ru.job4j.colection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSirter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("aFix bug", 1),
                new Job("fix bug", 4),
                new Job("Fix bug", 2),
                new Job("A task", 2)
        );

//  - по имени и по возрастанию
        Comparator<Job> combBNameIncrease = new JobDescByName();
        Collections.sort(jobs, new JobDescByName());
        System.out.println(jobs);

// - по имени и по убыванию
        Comparator<Job> combBNameDecrease = new JobByNameDecrease();
        Collections.sort(jobs, combBNameDecrease);
        System.out.println(jobs);

// -  - по приоритету и по возрастанию

        Collections.sort(jobs, new JobDescByName());
        System.out.println(jobs);

// -  - по приоритету и по убыванию

        Collections.sort(jobs, new JobDescByPriority().thenComparing(new JobDescByName()));
        System.out.println(jobs);
    }
}

