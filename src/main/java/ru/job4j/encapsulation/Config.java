package ru.job4j.encapsulation;

import java.util.Date;

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    public String search(String key) {
        return key;
    }

    public static class Police {
        public static void main(String[] args) {
            License license = new License();
            license.owner = "Petr Arsentev";
            String c = license.owner;
            license.setModel("Toyota");
            license.setCode("xx111x");
            license.setCreated(new Date());

            System.out.println(c);
        }
    }
}