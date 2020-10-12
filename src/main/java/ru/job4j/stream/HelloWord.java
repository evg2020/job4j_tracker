package ru.job4j.stream;

import java.util.stream.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;
import java.util.Map;


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

//        А можно преобразовать стрим из строк в мапу,
//        причём ключом сделать первую букву соответствующего слова:

        Map<String, String> fruit = Stream.of("apple", "banana", "lemon", "orange")
                .collect(Collectors.toMap(e -> e.substring(0, 1), e -> e));
        System.out.println(fruit);
        // {a=apple, b=banana, l=lemon, o=orange}

}
}
