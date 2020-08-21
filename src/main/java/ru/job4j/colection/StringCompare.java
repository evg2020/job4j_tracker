package ru.job4j.colection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override

    public int compare(String left, String right) {
        int res = 0;
        int left01 = left.length();
        int right01 = right.length();
        int minNumber = Math.min(left01, right01);
        for (int i = 0; i < minNumber; i++) {
            res = Character.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                 break;
            } else {
                res = left01 - right01;
            }

        }
        return res;
    }
}












