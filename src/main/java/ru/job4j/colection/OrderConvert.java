package ru.job4j.colection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> order) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order ea : order) {
            map.put(ea.getNumber(), ea);

        }
        return map;
    }
}
