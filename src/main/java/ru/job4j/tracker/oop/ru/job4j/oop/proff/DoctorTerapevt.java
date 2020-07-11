package ru.job4j.tracker.oop.ru.job4j.oop.proff;

public class DoctorTerapevt extends Doctor {
    public DoctorTerapevt(String name, String surname, boolean education, String birthday) {
        super(name, surname, education, birthday);
    }

    public static void main(String[] args) {
        Teacher teach01 = new Teacher("Teacher Vova", "Ivanov", true, "01.01.2200");
        System.out.println(teach01.getName());
        DoctorTerapevt docTer01 = new DoctorTerapevt("Ivan", "DoctorTerapevt", true, "01.01.2200");
        System.out.println(docTer01.getSurname());
    }
}
