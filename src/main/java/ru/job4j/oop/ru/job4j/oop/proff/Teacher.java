package ru.job4j.oop.ru.job4j.oop.proff;

public class Teacher extends Profession {
    public Teacher(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public static void main(String[] args) {
        Teacher teach01 = new Teacher("Vova", "Ivanov", true, "01.01.2200");
        System.out.println(teach01.getName());
    }
}
