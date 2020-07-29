package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.StreamSupport;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, ArrayList<UserAction> actionsTab) {
        boolean run = true;
        while (run) {
            this.showMenu(actionsTab);
            int select = input.askInt("Select: ");
             if (select < 0 || select >= actionsTab.size()) {
                 out.println("Wrong input, please select: 0.. " + (actionsTab.size() - 1));
                 continue;
             }
               UserAction action = actionsTab.get(select);
                run = action.execute(input, tracker);
            }
        }


    private void showMenu(ArrayList<UserAction> actionsTab) {
     out.println("Menu.");
        for (UserAction value : actionsTab) {
            out.println(actionsTab.indexOf(value) + ". " + value.name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actionsTab = new ArrayList<>();
            actionsTab.add(new CreateItem(output));
            actionsTab.add(new AllItem(output));
            actionsTab.add(new EditItem());
            actionsTab.add(new DeleteItem(output));
            actionsTab.add(new FindItemsById(output));
            actionsTab.add(new FindItemsByName(output));
            actionsTab.add(new ExitProgram());
       /* UserAction[] actionsTab = {
                new CreateItem(output),
                new AllItem(output),
                new EditItem(),
                new DeleteItem(output),
                new FindItemsById(output),
                new FindItemsByName(output),
                new ExitProgram()
        };*/
        new StartUI(output).init(input, tracker, actionsTab);
    }
}

