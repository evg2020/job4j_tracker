package ru.job4j.colection;

import java.util.HashMap;

public class FreezeStr03 {
    public static boolean eq(String origin, String line) {
        boolean res = true;
        Integer count = 1;
        String[] origins = origin.split("");
        String[] lines = line.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : origins) {
            map.putIfAbsent(word, count);
            if (map.containsKey(word)) {
                count++;
            }
            for (String wordLines : lines) {
                if (map.containsKey(wordLines)) {
                    count--;
                    map.put(wordLines, count);
                    if(count == 0 ){
                        map.remove(wordLines);
                    }
                }
            }
            if (map.size() > 0) {
                res = false;
            }
        }
        System.out.println(map);
        return res;
    }

    public static void main(String[] args) {
        eq("hello", "heloo");
        System.out.println();
    }

}


