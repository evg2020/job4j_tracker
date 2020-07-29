package ru.job4j.colection;
import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("VOLVO");
        autos.add("Toyota");
        for (String name : autos) {
            System.out.println(name);
        }
    }
}
