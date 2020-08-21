package ru.job4j.colection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.util.Collection;
import java.util.Arrays;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}