package ru.job4j.colection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean res = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            res = true;
        }
        return res;
    }

    public Citizen get(String passport) {

        if (citizens.containsKey(passport)) {
            Citizen citizen = citizens.get(passport);
            System.out.println(citizen.toString());
            return citizen;

        } else {
        System.out.println("No passport in the data base");
        return null;
        }

    }

    public static void main(String[] args) {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.get("2f44as");
    }
    }

