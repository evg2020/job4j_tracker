package ru.job4j.colection;
import java.util.ArrayList;

//import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add(1,"Ivan");
        names.add("Stepan01");
        names.add("GGG");
        names.remove(3);
        names.set(0, "Stepan02");
        for (Object in : names) {
            System.out.println(in);
            
        }
    }
}
