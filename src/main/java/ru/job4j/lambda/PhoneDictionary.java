package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> findByName = (Person person) -> person.getName().contains(key);
        Predicate<Person> findBySurname = (Person person) -> person.getSurname().contains(key);
        Predicate<Person> findByPhone = (Person person) -> person.getPhone().contains(key);
        Predicate<Person> findByAddress = (Person person) -> person.getAddress().contains(key);
        Predicate<Person> combine = (Person person) -> findByName.test(person)
                || findBySurname.test(person)
                || findByPhone.test(person)
                || findByAddress.test(person);
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine.test(person) ) {
                result.add(person);
            }
        }

        return result;
    }
}
