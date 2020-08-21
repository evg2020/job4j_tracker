package ru.job4j.tracker.oop.ru.job4j.oop.proff;

public class EngineerService extends Engineer {
    public EngineerService(
            String name, String surname, boolean education,
            String birthday, String jobName) {
        super(name, surname, education, birthday, jobName);
    }

        public static void main(String[] args) {
        EngineerService engServ01 = new EngineerService(
                "EngineerService", "Ivanova",
                true, "01.01.2200", "Programmer"
        );
        System.out.println(engServ01.getName());
        System.out.println(engServ01.getJobName());
    }
}
