package ru.job4j.io;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remaider = 11;
        int n = 1;
        while (remaider > 3) {

            System.out.println("Введите количество спичек 1, 2 или 3");
            if (n % 2 != 0) {
                System.out.println("Игрок 1");
            } else {
                System.out.println("Игрок 2");
            }

            int select = Integer.valueOf(input.nextLine());
            if (select <= 3 && select > 0) {
                remaider = remaider - select;
                System.out.println("Остаток " + remaider);
                n++;
            } else {
                System.out.println("количество спичек допустимое 1 или 2 или 3");
            }
        }
        System.out.println("Выиграл игрок " + n % 2);
    }
}
