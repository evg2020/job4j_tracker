package ru.job4j.io;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remaider = 11;
        while (remaider > 3) {
                        System.out.println("Введите количество спичек 1, 2 или 3");

            int select = Integer.valueOf(input.nextLine());
            if (select == 1 || select == 2 || select == 3) {
                remaider = remaider - select;
                System.out.println("Остаток " + remaider);
            } else {
                System.out.println("количество спичек допустимое 1 или 2 или 3");
            }
        }

        System.out.println("Ваш оппонент выиграл потому, что он забирает спички " + remaider + " шт");
    }
}
