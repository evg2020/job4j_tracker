package ru.job4j.tracker;

public class AllItem  implements UserAction {

    @Override
    public String name() {
        return "All items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===All items===");
        Item[] all = tracker.findAll();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
        return true;
    }
}
