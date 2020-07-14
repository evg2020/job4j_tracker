package ru.job4j.tracker;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class StartUI {
    public void init(Input input, Tracker tracker, UserAction[] actionsTab) {
        boolean run = true;
        while (run) {
            this.showMenu(actionsTab);
            int select = input.askInt("Select: ");
            if (select >= actionsTab.length || select < 0) {
                System.out.println("Please, select item: 0 .. " + (actionsTab.length - 1));
//                continue;
            } else {
                UserAction action = actionsTab[select];
                run = action.execute(input, tracker);
            }
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
        UserAction[] actionsTab = {
                new CreateItem(),
                new AllItem(),
                new EditItem(),
                new DeleteItem(),
                new FindItemsById(),
                new FindItemsByName(),
                new ExitProgram()
        };
        new StartUI().init(input, tracker, actionsTab);
    }
}

