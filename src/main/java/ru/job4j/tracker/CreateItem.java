package ru.job4j.tracker;

public class CreateItem implements UserAction {

    @Override
    public String name() {
        return "Create a new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Add new Item===");
        String name = input.askStr("Enter name: ");
        Item item = new Item();
        item.setName(name);
        tracker.add(item);
        return true;
    }
}
