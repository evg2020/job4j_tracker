package ru.job4j.io;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int remaider = 11;
        int n = 0;
        while (remaider > 0) {
            System.out.println("Введите количество спичек 1, 2 или 3");
            System.out.println("Игрок " + (n % 2 + 1));
            int select = Integer.valueOf(input.nextLine());
            if (select <= 3 && select > 0) {
                remaider = remaider - select;
                System.out.println("Остаток " + remaider);
                if (remaider == 0) {
                    break;
                }
                n++;
            } else {
                System.out.println("количество спичек НЕ допустимое ");
            }
        }
        System.out.println("Выиграл игрок " + (n % 2 + 1));
    }
}
