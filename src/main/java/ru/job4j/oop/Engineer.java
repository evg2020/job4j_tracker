package ru.job4j.oop;

public class Engineer extends Profession {

    public Profession(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }


    public static void main(String[] args) {
        Engineer eng01 = new Engineer("SPBGTU");
        System.out.println(eng01.getName());
    }
}
