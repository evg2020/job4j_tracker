package ru.job4j.poly;

public interface Transport {
    String go();

    int passQuantity(int passenger);

    int fuelOnTheBoard(int fuel);
}
