package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int charge) {
        this.load = charge;
    }

    public void echange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery charge01 = new Battery(30);
        Battery charge02 = new Battery(60);
        System.out.println("уровень заряда " + charge01.load);
        charge01.echange(charge02);
        System.out.println("уровень заряда стал " + charge01.load);
    }
}
