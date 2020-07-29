package ru.job4j.tracker;

import java.util.ArrayList;

public class FindItemsByName implements UserAction {
    private final Output out;

    public  FindItemsByName(Output out) {
        this.out = out;

    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Find items by name===");
        String name = input.askStr("Enter name: ");
        ArrayList namesEqual = tracker.findByName(name);
//        Item[] namesEqual = tracker.findByName(name);
        if (namesEqual.size() != 0) {
            for (Object item : namesEqual) {
                System.out.println(item);
            }
        } else {
            System.out.println("No name in items");
        }
        return true;
    }
}
