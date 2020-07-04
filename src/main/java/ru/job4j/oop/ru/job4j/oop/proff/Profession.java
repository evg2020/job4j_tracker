package ru.job4j.oop.ru.job4j.oop.proff;

public class Profession {
    private String name;
    private String surname;
    private boolean education;
    private String birthday;

    public Profession(String name, String surname, boolean education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

     public String getName() {
        return this.name;
     }

     public String getSurname() {
         return this.surname;
     }

    public static void main(String[] args) {
        Profession prof01 = new Profession("Olga", "Ivanova", true, "01.01.2000");
        System.out.println(prof01.getName());
    }
}
