package ru.job4j.colection;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Set;

public class UseMap {
    public static void main(String[] args) {

    HashMap<String, String> map = new HashMap<>();
    map.put("key01", "value01");
    map.put("parsentev@yandex.ru", "Petr Arsentev");
    map.put("evg@yandex.ru", "Evg");
    map.put("parsentev@yandex.ru", "Petr Arsentev");
    map.remove("key01");

    for (String key : map.keySet()) {
        String val = map.get(key);
        System.out.println(key + " =  " + val);
    }


    }

}
