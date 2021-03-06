package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByKey() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Ivanov", "1234", "Moscow")
        );
        phones.add(
                new Person("Ivans", "Ivanovs", "1234", "Moscow")
        );
        ArrayList<Person> persons = phones.find("cow");
        assertThat(persons.get(0).getAddress(), is("Moscow"));

    }
}