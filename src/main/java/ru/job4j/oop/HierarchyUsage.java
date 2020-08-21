package ru.job4j.oop;

public class HierarchyUsage {
    private Car car = new Car();
    private Transport tp = car;
//    Object obj = car;

    /* Приведение типа за счет понижения по иерархии. *//*
    Object ocar = new Car();
    Car carFromObject = (Car) ocar;

    Object bicycle = new Bicycle();
    Car cb = (Car) bicycle;*/
}
