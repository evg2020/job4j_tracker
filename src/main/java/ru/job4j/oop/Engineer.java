package ru.job4j.oop;

public class Engineer extends Profession {
    private String jobName;

    public Engineer(String name, String surname, boolean education, String birthday,String job) {
        super(name, surname, education, birthday);
        this.jobName = job;
    }

    public String getJobName() {
        return this.jobName;
    }


    public static void main(String[] args) {
        Engineer eng01 = new Engineer("Evgenii", "Ivanova", true, "01.01.2200", "Programmer");
        System.out.println(eng01.getName());
        System.out.println(eng01.getJobName());
    }
}
