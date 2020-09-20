package ru.job4j.colection;

import java.util.*;

public class FreezStr02 {
    public static boolean eq(String origin, String line) {
        boolean res = false;
        String[] wordOrigin = origin.split("");
        String[] wordLine = line.split("");

        List<String> origins = Arrays.asList(wordOrigin);
        List<String> lines = Arrays.asList(wordLine);

        Collections.sort(origins);
        Collections.sort(lines);

        res = origins.equals(lines);

        return res;
    }
}

