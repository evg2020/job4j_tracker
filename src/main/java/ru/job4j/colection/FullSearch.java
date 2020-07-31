package ru.job4j.colection;
import java.util.HashSet;
import java.util.List;

//класс, который извлечен все номера и уберет дубликаты.

public class FullSearch {
    public  static  HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task dd : list) {
            String ssdd = dd.getNumber();
            numbers.add(ssdd);
        }
        return numbers;
    }

}
