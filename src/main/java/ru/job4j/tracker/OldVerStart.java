package ru.job4j.tracker;
import java.util.Arrays;
public class OldVerStart {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            System.out.println();
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Input items")); // ввести пункт меню

            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
                System.out.println("Name was saved in items");

            } else if (select == 1) {
                System.out.println("===All items===");
                Item[] all = tracker.findAll();
                for (int i = 0; i < tracker.findAll().length; i++) {
                    System.out.println(all[i]);
                    //String name = tracker.findAll()[i].getName();
                    //int id = tracker.findAll()[i].getId();
                    //System.out.println("Name: " + name + "...id:" + id);
                }

            } else if (select == 2) {
                System.out.println("===Edit items===");
                int id = Integer.valueOf(input.askStr("Enter Id: "));
                Item idFind = tracker.findById(id);
                if (idFind != null) {
                    String name = input.askStr("Enter name: ");
                    Item item = new Item();
                    item.setName(name);
                    boolean replace = tracker.replace(id, item);
                } else {
                    System.out.println("Can not find id");
                }

            } else if (select == 3) {
                System.out.println("===Delete item===");
                int id = Integer.valueOf(input.askInt("Enter Id: "));
                boolean del = tracker.delete(id);
                if (del) {
                    System.out.println("Id " + id + " was deleted :" + del);
                } else {
                    System.out.println("Can not find id");
                }

            } else if (select == 4) {
                System.out.println("===Find item by Id===");
                int id = Integer.valueOf(input.askInt("Enter Id: "));
                Item idFind = tracker.findById(id);
                if (idFind != null) {
                    System.out.println(idFind);
                } else {
                    System.out.println("Can not find id");
                }

            } else if (select == 5) {
                System.out.println("===Find items by name===");
                String name = input.askStr("Enter name: ");
                Item[] namesEqual = tracker.findByName(name);
                if (namesEqual.length != 0) {
                    for (int i = 0; i < namesEqual.length; i++) {
                        System.out.println(namesEqual[i]);
                    }
                } else {
                    System.out.println("No name in items");
                }

            } else if (select == 6) {
                run = false;

            }
        }
    }

    private void showMenu() {
        System.out.println("== Menu==");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}


