package ru.job4j.ex;

public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start>finish");
        }
        int res = 0;
        for (int i = 0; i != finish; i++) {
            res += i;
        }
        return  res;
    }

     public static void main(String[] args) {
        System.out.println(add(6, 4));
    }
}


