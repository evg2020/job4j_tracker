package ru.job4j.tracker.oop;

public class Car {
    private int maxSpeed;
    private String model;

// создание фунции-конструктора, с
    public Car(String modelName, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = modelName;
    }

//перегрузка конструктора
public Car(int maxSpeed, String modelName) {
    this.model = modelName;
    this.maxSpeed = maxSpeed;
}

    public static void main(String[] args) {
        Car car01 = new Car(200,"Citroen");
        System.out.println(car01.model);
        System.out.println(car01.maxSpeed);
    }

}
