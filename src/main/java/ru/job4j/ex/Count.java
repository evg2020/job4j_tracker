package ru.job4j.ex;

// IllegalArgumentException - метод вызывает с не корректными параметрами.
//IllegalStateException  метод вызывается с объекта в не корректном состоянии.
//NullPointerException  методы вызывается у переменной, которая инициализирована null ссылкой.

public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Allert start > finish");
        }
        if (start == 0) {
            throw new NullPointerException("Null");
        }

        int res = 0;
        for (int i = 0; i < finish; i++) {
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(add(0, 4));
    }

}


