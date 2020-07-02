package ru.job4j.oop;

public class Calculator {
    public double add(double a, double b) {
        return a - b;
    }

    public double add(double a, double b, double c) {
        double temp = add(b, c);
        return add(a, temp);

    }

    public static void main(String[] args) {
        Calculator cal01 = new Calculator();
        System.out.println(cal01.add(1,3,5));
            }
}
