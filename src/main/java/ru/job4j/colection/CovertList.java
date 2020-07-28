package ru.job4j.colection;

import java.util.ArrayList;
import java.util.List;

public class CovertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> res = new ArrayList<>();
        for (int[] num : list) {
            for (int cell : num) {
                res.add(cell);
            }
        }
        return res;
    }
}
