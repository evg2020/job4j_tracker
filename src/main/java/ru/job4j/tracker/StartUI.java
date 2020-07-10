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
                    String name = tracker.findAll()[i].getName();
                    int id = tracker.findAll()[i].getId();
                    System.out.println("Name: " + name + "...id:" + id);
                }

            } else if (select == 2) {
                System.out.println("===Edit items===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item idFind = tracker.findById(id);
                    if (idFind != null ) {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        Item item = new Item();
                        item.setName(name);
                        boolean replace = tracker.replace(id, item);
                            if (replace) {
                                System.out.println("Item for " + name + " had been changed");
                            } else {
                                System.out.println("Item NOT changed");
                            }

                    } else {
                        System.out.println("Can not find id");
                    }

            } else if (select == 3) {
                System.out.println("===Delete item===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                boolean del = tracker.delete(id);
                    if (del) {
                    System.out.println("Id " + id + " was deleted : true or false: " + del);
                    } else {
                    System.out.println("Can not find id");
                    }

            } else if (select == 4) {
                System.out.println("===Find item by Id===");
                System.out.print("Enter Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item idFind = tracker.findById(id);
                    if (idFind != null ) {
                    System.out.println(idFind.getName());
                    } else {
                    System.out.println("Can not find id");
                    }

            } else if (select == 5) {
                System.out.println("===Find items by name===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] namesEqual = tracker.findByName(name);
                if (namesEqual != null) {
                    for (int i = 0; i < namesEqual.length; i++) {
                        System.out.println("Name: " + namesEqual[i].getName());
                    }
                } else {
                    System.out.println("Can not find id");
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
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(scanner, tracker);
        }
    }

