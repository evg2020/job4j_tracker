package ru.job4j.stream;

import ru.job4j.lambda.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class School {
//    Predicate<Student> predict = (Student student) ->student.getScore() >= 70;

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }
}
