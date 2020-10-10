package ru.job4j.stream;

import ru.job4j.oop.College;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixTolist {
    public static void main(String[] args) {
        Integer[] matrix01 = {1, 2, 3};
        Stream.of(matrix01)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Integer[][] matrix02 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        List<Integer> collection = Stream.of(matrix02)
                .flatMap(Stream::of)           // .flatMap(i->stream.of(i))
                .collect(Collectors.toList());


    }
}



