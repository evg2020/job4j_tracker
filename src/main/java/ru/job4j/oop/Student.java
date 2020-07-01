package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra-Tra-Tra");
    }
    public void playByByan() {
        System.out.println("Ti-tu-tu");

    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.playByByan();
        petya.playByByan();
        petya.playByByan();

    }
}
