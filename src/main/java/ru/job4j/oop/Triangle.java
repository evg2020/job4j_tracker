package ru.job4j.oop;
// 2.2. Рефакторинг - Площадь треугольника. [#299292]
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double period(double a, double b, double c) {
         double p = (a + b + c) / 2;
         return p;
    }

    public boolean exist(double a, double b, double c) {
                boolean exist = false;
            if ((a + b) > c && (a + c) > b && (c + b) > a) {
                exist = true;
            }
            return exist;

    }

    public double area() {
        double res = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return res;
    }
}
