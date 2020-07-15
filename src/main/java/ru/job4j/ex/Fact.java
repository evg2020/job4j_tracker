package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Факториал числа — произведение всех натуральных чисел от 1 до этого числа");
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;

        }
        return res;
    }

    public static void main(String[] args) {
        Fact fact = new Fact();
        int n = 2;
        System.out.println("Факториал " + n + " = " + fact.calc(n));
    }

}
