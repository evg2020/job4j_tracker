package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;
public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        Scanner input = new Scanner(System.in);
        System.out.println(" Я великий Оракул. Что ты хочешь узнать?");
        String question = input.nextLine();
        switch (answer) {
            case 0:
                System.out.println("No");
                break;
            case 1:
                System.out.println("Yes");
                break;
            default:
                System.out.println("Maybe");
                break;
             }
    }
}
