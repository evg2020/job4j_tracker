package ru.job4j.tracker;
// пробуем и разбираемся

import java.sql.SQLOutput;

public class Replace01 {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        Item item01 = new Item();
        item01.setName("Ivan");
        Item item02 = new Item();
        item02.setName("Petr");

            //можно назначать напрямую но не будет определяться счетчик id
       /*tracker.getItems()[0] = item01;
       tracker.getItems()[1] = item02; */

          // можно назначать через метод, тогда работеет счетчик
        tracker.add(item01);
        tracker.add(item02);


        System.out.println(tracker.getItems()[0].getName()); // достать то что лежит в обьекте тракер в его поле Итем в первой ячейке в его поле стринг наме
        System.out.println(tracker.getItems()[0].getId()); // достать то что лежит в обьекте тракер в его поле Итем в первой ячейке в его поле стринг наме



    }
}


