package ru.job4j.condition;

import java.lang.Math;
import java.util.Arrays;
import java.util.List;

public class LogicOr {

    public static String getElement(List<String> list) {
        String res;
        if (!list.isEmpty()) {
            res = list.get(0);
        } else {
            res = "";
        }

        return res;
    }

}


