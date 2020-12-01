package ru.job4j.stream;

import ru.job4j.lambda.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        /* Predicate<Student> predict = (Student student) -> student.getScore() < 50
        && student.getScore() > 0;
        */
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> listToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(student -> student.getName(), student -> student));
    }

    public static void main(String[] args) {
        Predicate<Student> predict = (Student student) -> student.getScore() <= 20;
        School school = new School();
        List<Student> expect = new ArrayList<>();
        expect.add(new Student(10, "Surname1"));
        expect.add(new Student(20, "Surname2"));
        expect.add(new Student(30, "Surname3"));
        expect.add(new Student(40, "Surname4"));
       Map<String, Student> collect = school.listToMap(expect);
        System.out.println(collect);
    }

}
