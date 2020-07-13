package ru.job4j.tracker.strategy;

public class Pain {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Pain context = new Pain();
//        Triangle tr = new Triangle();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}
