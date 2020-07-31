package ru.job4j.colection;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String dublicateText) {
        boolean res = true;
        String[] origin = originText.split(" ");
        String[] text02 = dublicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String wordOrigin : origin) {
            check.add(wordOrigin);
        }
        for (String word02: text02) {
            if (!check.contains(word02)) {
                res = false;
                break;
            }
        }
        return res;
    }
}
