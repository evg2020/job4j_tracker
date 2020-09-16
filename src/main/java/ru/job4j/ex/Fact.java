package ru.job4j.ex;

public class Fact {
        public int calcFact(int n) {

        int res;
        if (n < 0) {
            throw new IllegalArgumentException("Факториал числа ");
        }
        if (n == 0) {
            res = 1;
        } else {
            res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
        }
        return  res;
    }

        public static void main(String[]args) {

            Fact fact = new Fact();
            int n = 3;
            int res = fact.calcFact(n);
            System.out.println("Факториал " + n + " = " + res);
        }

    }

