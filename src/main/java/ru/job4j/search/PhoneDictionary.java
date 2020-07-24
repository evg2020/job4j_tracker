package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
     /*String str = "twinkle twinkle little star";
    boolean got = str.contains("little");*/
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
         for (Person value : persons) {
            if ((value.getName()
                    + value.getSurname()
                    + value.getPhone()
                    + value.getAddress()).contains(key)) {
                result.add(value);
            }
        }
        return result;
    }
}

