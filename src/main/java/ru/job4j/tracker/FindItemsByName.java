package ru.job4j.tracker;

public class FindItemsByName implements UserAction {

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Find items by name===");
        String name = input.askStr("Enter name: ");
        Item[] namesEqual = tracker.findByName(name);
        if (namesEqual.length != 0) {
            for (int i = 0; i < namesEqual.length; i++) {
                System.out.println(namesEqual[i]);
            }
        } else {
            System.out.println("No name in items");
        }
        return true;
    }
}
