package ru.job4j.lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

        1. Создайте ArrayList. Заполните его числами Integer.
        2. Получите из ArrayList поток данных.
        Отфильтруйте поток так, чтобы в нем остались
        только положительные числа.
        3. Отфильтрованный поток запишите в List.
       */
public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(lists);
        List<Integer> filtsPositive = lists.stream()
                .filter(list -> list % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filtsPositive);
    }
}
