package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {

        Output.println("===Delete item===");
        int id = Integer.valueOf(input.askInt("Enter Id: "));
        boolean del = tracker.delete(id);
        if (del) {
            Output.println("Id " + id + " was deleted :" + del);
        } else {
            Output.println("Can not find id");
        }
        return true;
    }
}
