package ru.job4j.stream;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(28, "Mash"));
        input.add(new Student(128, "Petya"));
        List<Student> expected = List.of(
                new Student(28, "Mash"),
                new Student(128, "Petya"));
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

        @Test
        public void whenNull() {
            List<Student> input = new ArrayList<>();
            input.add(null);
            input.add(new Student(128, "Petya"));
            List<Student> expected = List.of(
                    new Student(128, "Petya")
                    );
            assertThat(StudentLevel.levelOf(input, 100), is(expected));
        }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add( null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    }
