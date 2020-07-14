package ru.job4j.tracker;

public class EditItem implements UserAction {
    @Override
    public String name() {
        return "Edit items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Edit items===");
        int id = Integer.valueOf(input.askStr("Enter Id: "));
        Item item = new Item();
        String name = input.askStr("Enter name: ");
        item.setName(name);
        boolean replaceName = tracker.replace(id, item);
        if (replaceName) {
            System.out.println("Item had been replaced");
        } else {
            System.out.println("Can not find id");
        }
        return true;
    }
}
