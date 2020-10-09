package ru.job4j.stream;

import ru.job4j.oop.College;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixTolist {
    public static void main(String[] args) {


        Integer[][] matrix = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        public static List<Integer> matrixToList (Integer[][] matrix) {
            return Arrays.stream(matrix)
                    .flatMap(Arrays::asList)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        }
       
    }

}
