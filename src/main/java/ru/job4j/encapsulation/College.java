package ru.job4j.encapsulation;
import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student studen01 = new Student();
        studen01.setName("Ivan Ivanov");
        studen01.setGroup("234");
        studen01.setReceiptDate("01/01/2020");
        System.out.println(studen01.getName() + " : " + studen01.getGroup() + " : "
                + studen01.getReceiptDate());
    }
}
