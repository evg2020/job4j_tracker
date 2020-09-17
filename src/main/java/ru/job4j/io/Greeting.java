package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Privet. What is your name? ");
        String name = input.nextLine();
        System.out.println(name + ",hi");
        int rnd = new Random().nextInt(10);
        System.out.println(rnd);

        System.out.println(1 % 2);

    }
}



