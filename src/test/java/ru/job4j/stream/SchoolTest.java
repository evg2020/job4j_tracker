package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void seUp() {
        students.add(new Student(10, "Surname1"));
        students.add(new Student(20, "Surname2"));
        students.add(new Student(30, "Surname3"));
        students.add(new Student(40, "Surname4"));
        students.add(new Student(50, "Surname5"));
        students.add(new Student(60, "Surname6"));
        students.add(new Student(70, "Surname7"));
        students.add(new Student(80, "Surname8"));
        students.add(new Student(90, "Surname9"));
    }


    @Test
    public void whenCollectClassA() {
        School sc = new School();
        Predicate<Student> predictA = (Student student) -> student.getScore() >= 70 && student.getScore() <= 100;
        List<Student> res = sc.collect(students, predictA);
        List<Student> expect = new ArrayList<>();
        expect.add(new Student(70, "Surname7"));
        expect.add(new Student(80, "Surname8"));
        expect.add(new Student(90, "Surname9"));
        assertThat(res, is(expect));
    }

    @Test
    public void whenCollectClassB() {
        School sc = new School();
        Predicate<Student> predictB = (x) -> x.getScore() < 70 && x.getScore() >= 50;
        List<Student> res = sc.collect(students, predictB);
        List<Student> expect = new ArrayList<>();
        expect.add(new Student(50, "Surname5"));
        expect.add(new Student(60, "Surname6"));
        assertThat(res, is(expect));
    }

    @Test
    public void whenCollectClassC() {
        School sc = new School();
        Predicate<Student> predictC = (Student student) -> student.getScore() < 50 && student.getScore() > 0;
//        predictC.test(student);
        List<Student> res = sc.collect(students, predictC);
        List<Student> expect = new ArrayList<>();
        expect.add(new Student(10, "Surname1"));
        expect.add(new Student(20, "Surname2"));
        expect.add(new Student(30, "Surname3"));
        expect.add(new Student(40, "Surname4"));
        assertThat(res, is(expect));
    }
}