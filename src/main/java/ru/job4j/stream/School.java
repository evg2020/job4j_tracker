package ru.job4j.stream;

import ru.job4j.lambda.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
//        Predicate<Student> predict = (Student student) -> student.getScore() < 50
//        && student.getScore() > 0;
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> listToMap(List<Student> students) {
        return students.stream()

                .collect(Collectors.toMap(student -> student.getName(),
                        student -> student, (st01, st02) -> st02));
    }

}
