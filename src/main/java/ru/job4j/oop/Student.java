package ru.job4j.oop;

public class Student {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 0) {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music(1);
    }
}
