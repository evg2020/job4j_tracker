package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void add(Person person) {
        persons.add(person);
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
            if (value.getName().contains(key)
                    || value.getSurname().contains(key)
                    || value.getPhone().contains(key)
                    || value.getAddress().contains(key)) {
                result.add(value);
            }
        }
        return result;
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")

    public static void main(String[] args) {
        PhoneDictionary list = new PhoneDictionary();
        list.add(new Person("Ivan", "Ivanov", "12455", "Moscow")
        );
        list.add(new Person("Petr", "Ivanovs", "1245", "Moscow")
        );
        for (Person in : list.getPersons()) {
            System.out.println(in.toString());
        }

        ArrayList<Person> res = list.find("1245");
        for (Person in : res) {
            System.out.println(in.toString());
        }
    }
}



