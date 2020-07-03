package ru.job4j.oop;

public class Engineer extends Profession {


        public boolean getEducation() {
            return this.education;
        }

    public static void main(String[] args) {
        Engineer eng01 = new Engineer("SPBGTU");
        System.out.println(eng01.getEducation());
    }
}
