package ru.job4j.oop;

public class Car {
    private int maxSpeed;
    private String model;

// создание фунции-конструктора, с
    public Car(String modelName, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = modelName;
    }

//перегрузка конструктора
public Car(String modelName) {
    this.maxSpeed = maxSpeed;
}

    public static void main(String[] args) {
        Car car01 = new Car("Citroen", 200);
        System.out.println(car01.model);
        System.out.println(car01.maxSpeed);
    }

}
