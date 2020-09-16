package ru.job4j.tracker.strategy;

public class Picture {
    public  void draw(Shape shape){
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
     Picture content = new Picture();
     Shape trianglse = new Triangle();
     content.draw(trianglse);
     content.draw(new Square());

    }
}
