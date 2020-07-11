package ru.job4j.tracker.oop;

//2.1. Рефакторинг - Расстояние между точками. [#299291]
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    // поле объекта
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point a, Point b) {
        return  sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2) + pow(a.z - b.z, 2));

    }

  /*  public static void main(String[] args) {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double distance = a.distance(b);
        double distance3d = a.distance3d(a, b);
        System.out.println(distance3d);
    }*/
}