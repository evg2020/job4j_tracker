package ru.job4j.oop;

public class Car {
    int maxSpeed;
    String model;


    public Car(String modelName, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = modelName;
    }


    public static void main(String[] args) {
        Car car01 = new Car("Citroen", 200);
        System.out.println(car01.model);
        System.out.println(car01.maxSpeed);
    }

}
