package ru.job4j.colection;
//Даны две строки. Нужно проверить,
// что вторая строка получилась методом перестановок
// символов в первой строке.

import javax.swing.*;
import java.util.HashSet;

public class FreezeStr {
    public static boolean eq(String left, String right) {

        char[] lefts = left.toCharArray();
        char[] rights = right.toCharArray();
        int leftIntSumm = 0;
        int rightIntSumm = 0;
        for (char left01 : lefts) {
            int ascii = (int) left01;
            leftIntSumm += ascii;
        }
        for (char right01 : rights) {
            int ascii = (int) right01;
            rightIntSumm += ascii;
        }
        return (leftIntSumm == rightIntSumm);
    }

    public static void main(String[] args) {
        String left = "hello df";
        String right = "oloeh df";

        System.out.println(eq(left, right));

    }
}




