package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

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
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Ivanov", "1234", "Moscow")
        );
        phones.add(
                new Person("Petr", "Ivanov", "345", "Moscow")
        );
        for (Person person : phones.getPersons()) {
            System.out.println(person.toString());
        }
        System.out.println(phones.getPersons().get(0).toString());
//        находи в phone поле person с типом ArrayList<Person >, выбираем элемент 0 и из него выводим все поля на консоль
//        ArrayList<Person> persons = phones.find("cow");

    }
}



