package ru.job4j.stream;

import ru.job4j.pojo.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> st != null)
                .sorted((left, right) -> right.getName().compareTo(left.getName()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }

}
