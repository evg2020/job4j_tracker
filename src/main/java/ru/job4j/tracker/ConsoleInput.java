package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    /*StartUI startUI = new StartUI();
     startUI.init(scanner, tracker);*/

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
         return Integer.valueOf(askStr(question));
    }
}