package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllItem  implements UserAction {

    private final Output out;

    public  AllItem(Output out) {
        this.out = out;

    }

    @Override
    public String name() {
        return "All items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===All items===");
        List<Item> item = tracker.findAll();
        for (Item value : item) {
            System.out.println(value);
        }
        return true;
    }
}
