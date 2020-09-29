package ru.job4j.lambda;
//код, который складывает числа массива.

import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 1};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            int temp = total;
            total = add(() -> temp + num);
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}

