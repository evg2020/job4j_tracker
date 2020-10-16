package ru.job4j.lambda;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s + "1";
        Function<String, String> f2 = s -> s + "2";
        Function<String, String> f3 = s -> s + "3";
        Function<String, String> f4 = s -> s + "4";
        System.out.println(f1.andThen(f2).compose(f3).compose(f4).apply("ABCD"));
        System.out.println(f1.andThen(f2).andThen(f3).apply("ABCD"));
    }

}
