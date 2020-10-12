package ru.job4j.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;


public class HelloWord {
    public static void main(String[] args) {

        String[] array = {"Java", "Ruuuuussshhh"};
        Arrays.stream(array)
                .map(s -> s.split("")) //Преобразование слова в массив букв
                .flatMap(i -> Arrays.stream(i)).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList())
                .forEach(System.out::println);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min = numbers.stream()
                .min(Integer::compare);
        System.out.println(min.get());  // 1

        List<String> fruits = Stream.of("Hallo", " Word")
                // здесь могут быть ещё какие-то преобразования
                .collect(Collectors.toList());
        System.out.print(fruits);

        System.out.println();

//        А можно преобразовать стрим из строк в мапу,
//        причём ключом сделать первую букву соответствующего слова:

        Map<String, String> fruit = Stream.of("apple", "banana", "lemon", "orange")
                .collect(Collectors.toMap(e -> e.substring(0, 1), e -> e));
        System.out.println(fruit);
        // {a=apple, b=banana, l=lemon, o=orange}

        Integer[] arrays = {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.asList(arrays);
        System.out.println(list);
        arrays[0] = 10;
        System.out.println(list);
//        list.set(0, 11);
        Stream.of(arrays)
                .filter(s-> s % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .forEach(s-> System.out.print(s +" "));

        System.out.println();

        List.of(1, 2, 3, 4).stream()
                .dropWhile(v -> v < 3)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);

        System.out.println();

        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
                System.out.println(
               matrix.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList())
        );
    }
}

