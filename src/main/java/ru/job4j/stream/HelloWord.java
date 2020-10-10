package ru.job4j.stream;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class HelloWord {
    public static void main(String[] args) {

        String[] array = {"Java", "Ruuuuussshhh"};
        Arrays.stream(array)
                .map(s -> s.split("")) //Преобразование слова в массив букв
                .flatMap(i -> Arrays.stream(i)).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);



    }
}
