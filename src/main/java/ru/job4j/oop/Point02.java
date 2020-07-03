package ru.job4j.oop;

//2.1. Рефакторинг - Расстояние между точками. [#299291]

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point02 {

    // поле объекта
    private int x;
    private int y;

    public Point02() {
    }

    public Point02(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  double distance(Point02 a, Point02 that02) {
        return (sqrt(pow(a.x - that02.x, 2) + pow(a.y - that02.y, 2)));
    }

    public static void main(String[] args) {
        Point02 a = new Point02(0, 0);
        Point02 b = new Point02(0, 3);
        double c = a.distance(a, b);

        System.out.println(c);
    }
}