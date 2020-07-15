package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Delete item===");
        int id = Integer.valueOf(input.askInt("Enter Id: "));
        boolean del = tracker.delete(id);
        if (del) {
            System.out.println("Id " + id + " was deleted :" + del);
        } else {
            System.out.println("Can not find id");
        }
        return true;
    }
}