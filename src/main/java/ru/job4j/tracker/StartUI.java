package ru.job4j.tracker;

import java.util.Scanner;
import java.util.Arrays;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            System.out.println();
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine()); // ввести пункт меню
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
                System.out.println("Name was saved in items");
            } else if (select == 1) {
                System.out.println("===All items===");
                for (int i = 0; i < tracker.findAll().length; i++) {
                    System.out.println("Name: " + tracker.getItems()[i].getName() + "...id:" + tracker.getItems()[i].getId());
                }
            } else if (select == 2) {
                System.out.println("===Edit items===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                boolean replace = tracker.replace(id, item);
                System.out.println("Item for " + name + " was changed : true or false: " + replace);
            } else if (select == 3) {
                System.out.println("===Delete item===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                boolean del = tracker.delete(id);
                System.out.println("Id " + id + " was deleted : true or false: " + del);
            } else if (select == 4) {
                System.out.println("===Find item by Id===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println(tracker.findById(id).getName());
            } else if (select == 5) {
                System.out.println("===Find items by name===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                for (int i = 0; i < tracker.findByName(name).length; i++) {
                System.out.println("Name: " + tracker.findByName(name)[i].getName() + "...id:" + tracker.findByName(name)[i].getId());
                }
            }
            }

        }


        private  void showMenu() {
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
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(scanner, tracker);
        }
    }

