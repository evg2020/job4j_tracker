package ru.job4j.tracker;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actionsTab) {
        boolean run = true;
        while (run) {
            this.showMenu(actionsTab);
            int select = input.askInt("Select: ");
            if (select >= actionsTab.length || select < 0) {
             out.println("Please, select item: 0 .. " + (actionsTab.length - 1));
//                continue;
            } else {
                UserAction action = actionsTab[select];
                run = action.execute(input, tracker);
            }
        }
    }

    private void showMenu(UserAction[] actions) {
     out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actionsTab = {
                new CreateItem(output),
                new AllItem(output),
                new EditItem(),
                new DeleteItem(output),
                new FindItemsById(output),
                new FindItemsByName(output),
                new ExitProgram()
        };
        new StartUI(output).init(input, tracker, actionsTab);
    }
}

