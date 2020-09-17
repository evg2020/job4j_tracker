package ru.job4j.colection;

import org.junit.Test;
import ru.job4j.colection.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobSorterTest {

    @Test
    public void sortByNameInc() {
        List<Job> result = Arrays.asList(
                new Job("aFix bug", 1),
                new Job("fix bug", 4),
                new Job("Fix bug", 2),
                new Job("A task", 2));
        Comparator<Job> combBNameIncrease = new JobDescByName();
        Collections.sort(result, new JobDescByName());
        List<Job> expect = Arrays.asList(
                new Job("A task", 2),
                new Job("Fix bug", 2),
                new Job("aFix bug", 1),
                new Job("fix bug", 4));

        assertThat(result, is(expect));

    }

    @Test
    public void sortByNameDecr() {
        List<Job> result = Arrays.asList(
                new Job("aFix bug", 1),
                new Job("fix bug", 4),
                new Job("Fix bug", 2),
                new Job("A task", 2));
        Comparator<Job> combBNameDecrease = new JobByNameDecrease();
        Collections.sort(result, combBNameDecrease);
        List<Job> expect = Arrays.asList(
                new Job("fix bug", 4),
                new Job("aFix bug", 1),
                new Job("Fix bug", 2),
                new Job("A task", 2));
        assertThat(result, is(expect));
    }

    @Test
    public void sortByPriorInc() {

        List<Job> result = Arrays.asList(
                new Job("aFix bug", 1),
                new Job("fix bug", 4),
                new Job("Fix bug", 2),
                new Job("A task", 2));
        Comparator<Job> combPriorInc = new JobDescByPriority();
        Collections.sort(result, combPriorInc);
        List<Job> expect = Arrays.asList(
                new Job("aFix bug", 1),
                new Job("Fix bug", 2),
                new Job("A task", 2),
                new Job("fix bug", 4));
        assertThat(result, is(expect));
    }

    @Test
    public void sortByPriorDecr() {

        List<Job> result = Arrays.asList(
                new Job("aFix bug", 1),
                new Job("fix bug", 4),
                new Job("Fix bug", 2),
                new Job("A task", 2));
        Comparator<Job> combPriorDec = new JobDescByPriorityDecrease();
        Collections.sort(result, combPriorDec);
        List<Job> expect = Arrays.asList(
                new Job("fix bug", 4),
                new Job("Fix bug", 2),
                new Job("A task", 2),
                new Job("aFix bug", 1));

        assertThat(result, is(expect));
    }
}