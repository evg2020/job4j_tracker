package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.StreamSupport;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actionsTab) {
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

        private void showMenu(List<UserAction> actionsTab) {
        out.println("Menu.");
            for (int i = 0; i < actionsTab.size(); i++) {
                out.println(i + ". " + actionsTab.get(i).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actionsTab = new ArrayList<>();
            actionsTab.add(new CreateItem(output));
            actionsTab.add(new AllItem(output));
            actionsTab.add(new EditItem());
            actionsTab.add(new DeleteItem(output));
            actionsTab.add(new FindItemsById(output));
            actionsTab.add(new FindItemsByName(output));
            actionsTab.add(new ExitProgram());

        new StartUI(output).init(input, tracker, actionsTab);
    }
}

