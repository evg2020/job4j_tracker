package ru.job4j.tracker;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class StartUI {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select >= actions.length || select < 0) {
                System.out.println("Please select point: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateItem(),
                new AllItem(),
                new EditItem(),
                new DeleteItem(),
                new FindItemsById(),
                new FindItemsByName(),
                new ExitProgram()
        };
        new StartUI().init(input, tracker, actions);
    }
}

