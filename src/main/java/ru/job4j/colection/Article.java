package ru.job4j.colection;
//Задач большой текст. Из него вырезают слов и предложения. Из них составляют новый текст.
//
//Нужно проверить, что новый текст был получен из оригинально.

import java.util.HashSet;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean res = true;

        String[] bigText = origin.split("[, .!?:;]");
        String[] newText = line.split(" ");

        HashSet<String> check = new HashSet<>();
        for (String word : bigText) {
            check.add(word);
        }
        for (String wordsNewText : newText) {
            if (!check.contains(wordsNewText)) {
                res = false;
                break;
            }
        }
        return res;
    }
}
