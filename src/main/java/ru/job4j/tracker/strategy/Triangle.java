package ru.job4j.tracker.strategy;

public class Triangle implements Shape {

    @Override
    public String draw() {
        String line = System.lineSeparator();
        return    "   ^    " + line
                + " /   \\ " + line
                + "/_____\\" + line;
    }

    public static void main(String[] args) {
        /*Triangle triangle = new Triangle();
         System.out.println(triangle.draw());*/
        System.out.println(new Triangle().draw());
    }
}
