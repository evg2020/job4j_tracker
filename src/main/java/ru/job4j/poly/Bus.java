package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String go() {
        return null;
    }

    @Override
    public int passQuantity(int passenger) {
        return 0;
    }

    @Override
    public int fuelOnTheBoard(int fuel) {
        int price = fuel * 1000;
        return price ;
    }
}
