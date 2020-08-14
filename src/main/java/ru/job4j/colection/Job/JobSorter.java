package ru.job4j.colection.Job;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class JobSorter {

    //  - по имени и по возрастанию
    public List<Job> sortByNameInc(List<Job> jobs) {
        Comparator<Job> combBNameIncrease = new JobDescByName();
        Collections.sort(jobs, combBNameIncrease);
        return jobs;
    }

    // - по имени и по убыванию
    public List<Job> sortByNameDecr(List<Job> jobs) {
        Comparator<Job> combBNameDecrease = new JobByNameDecrease();
        Collections.sort(jobs, combBNameDecrease);
        return jobs;
    }

// -  - по приоритету и по возрастанию
        public List<Job> sortByPriorInc(List<Job> jobs) {
            Comparator<Job> combByPriorIncrease = new JobDescByPriority();
            Collections.sort(jobs, combByPriorIncrease);
            return jobs;
        }

// -  - по приоритету и по убыванию
        public List<Job> sortByPriorDecr(List<Job> jobs) {
            Comparator<Job> combByPriorDecrease = new JobDescByPriorityDecrease();
            Collections.sort(jobs, combByPriorDecrease);
            return jobs;

        }


    }


