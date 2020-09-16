package ru.job4j.tracker.oop.ru.job4j.oop.proff;

public class Teacher extends Profession {
    public Teacher(String name, String surname,String birthday, boolean education ) {
        super(name, surname, education, birthday);
    }



    public static void main(String[] args) {
        Teacher teach01 = new Teacher("Vova", "Ivanov", "01.01.2200",true);
        System.out.println(teach01.getName());
    }
}
