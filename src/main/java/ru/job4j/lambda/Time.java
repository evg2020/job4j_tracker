package ru.job4j.lambda;
import java.util.Comparator;
import java.util.Arrays;

public class Time {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Vanya"};
        Comparator<String> comp = (left, right) -> {
            System.out.println("execute comparetor");
            return left.length() - right.length();
        };
        Arrays.sort(names, comp);
    }
}
