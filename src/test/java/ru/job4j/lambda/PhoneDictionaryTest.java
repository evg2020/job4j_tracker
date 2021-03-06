package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;

public class PhoneDictionaryTest {

    @Test
    public void findByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
var persons = phones.find("534");
assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}