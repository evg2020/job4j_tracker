package ru.job4j.colection;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ListSoft {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 3, 4, 4, 5, 9);

       Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Integer first = -1;
        Integer second = 2;
        int rsl = first.compareTo(second);
        System.out.println(rsl);

         Integer st01 = 1;
         Integer st02 = 3;
         int res01 = st01.compareTo(st02);

        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);

        List<Job> jobs = Arrays.asList(new Job("Fix", 23), new Job("Dry", 23));
        Collections.sort(jobs);
        System.out.println(jobs);
    }
}

