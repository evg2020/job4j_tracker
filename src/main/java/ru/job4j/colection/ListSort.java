package ru.job4j.colection;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list01 = Arrays.asList(3, 4, 5, 2, 3);
        Collections.sort(list01);
        System.out.println(list01);

        Integer one = 3;
        Integer two = 4;
        System.out.println(one.compareTo(two));

        List<Integer> list02 = Arrays.asList(2, 3, 4, 5, 3, 2, 1);
        Collections.sort(list02, Collections.reverseOrder());
        System.out.println(list02);
    }
}
