package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Dist {
    public double dist(Point a, Point b) {
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Dist c = new Dist();
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        System.out.println(c.dist(a, b));
    }
}
