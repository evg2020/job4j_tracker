package ru.job4j.colection.Job;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int res = -1;
        int left01 = left.length();
        int right01 = right.length();
        int maxNumber = Math.max(left01, right01);
        if (left01 >= right01) {
            for (int i = 0; i < maxNumber - 1; i++) {
                int comp = Character.compare(left.charAt(i), right.charAt(i));
                if (comp == 0) {
                    res = 0;
                } else if (comp > 0) {
                    res = 1;
                    break;
                } else if (comp < 0) {
                    res = -1;
                    break;
                }

            }
        }


        return res;
    }


}












