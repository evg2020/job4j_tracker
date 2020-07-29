package ru.job4j.ex;

public class Print0ToN {
    public static boolean check(int num) {
        boolean res = false;
        if ( num % 2 == 0 ) {
            System.out.println("Число четное");
            res = true;
        }else{
            System.out.println("Число нечетное");
        }
        return res;
    }

    public static void main(String[] args) {
        check(3);

    }
}