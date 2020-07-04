package ru.job4j.oop.ru.job4j.oop.proff;

public class Doctor extends Profession {

    public Doctor(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public static void main(String[] args) {
        Doctor doc01 = new Doctor("Vlad", "Ivanov", true, "01.01.2200");
        System.out.println(doc01.getName());
    }
}
