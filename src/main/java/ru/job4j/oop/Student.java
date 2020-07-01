package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra-Tra-Tra");
    }

    public void song() {
        System.out.println("I believe I can");
    }

    public void playByByan() {
        System.out.println("Ti-tu-tu");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.playByByan();
        petya.playByByan();
        petya.playByByan();
        petya.song();
        petya.song();
        petya.song();

    }
}
