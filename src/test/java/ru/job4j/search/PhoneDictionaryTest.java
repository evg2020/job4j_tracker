package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Ivanov", "1234", "Moscow")
        );
        ArrayList<Person> persons = phones.find("cow");
        assertThat(persons.get(0).getName(), is("Ivan"));

    }
}