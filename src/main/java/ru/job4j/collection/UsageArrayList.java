package ru.job4j.collection;
import java.util.ArrayList;

//import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan01");
        names.add("GGG");
        names.remove(3);
        names.set(2, "Stepan02");
        for (Object in : names) {
            System.out.println(in);
            
        }
    }
}
