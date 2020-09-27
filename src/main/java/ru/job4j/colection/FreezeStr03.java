package ru.job4j.colection;

import java.util.HashMap;

public class FreezeStr03 {
    public static boolean eq(String origin, String line) {
        String[] origins = origin.split("");
        String[] lines = line.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : origins) {
            if (!map.containsKey(word)) {
                map.putIfAbsent(word, 1);
            } else {
                Integer count = map.get(word) + 1;
                map.put(word, count);
            }
        }
        System.out.println(map);

        for (String wordLines : lines) {
            if (map.containsKey(wordLines)) {
                if (map.get(wordLines) > 1 && map.get(wordLines) != null) {
                    Integer count = map.get(wordLines) - 1;
                    map.put(wordLines, count);
                } else {
                    map.remove(wordLines);
                }
            }

        }
        return (map.size() == 0);
    }
       /* if (map.size() > 0) {
            res = false;
        }

        return res;
    }*/

    public static void main(String[] args) {
        System.out.println(eq("helooo", "heoool"));
    }
}


