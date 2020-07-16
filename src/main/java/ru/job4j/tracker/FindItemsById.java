package ru.job4j.tracker;

public class FindItemsById implements  UserAction {
    private final Output out;

    public  FindItemsById(Output out) {
        this.out = out;

    }


    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("===Find item by Id===");
        int id = Integer.valueOf(input.askInt("Enter Id: "));
        Item idFind = tracker.findById(id);
        if (idFind != null) {
            System.out.println(idFind);
        } else {
            System.out.println("Can not find id");
        }
        return true;
    }
}
