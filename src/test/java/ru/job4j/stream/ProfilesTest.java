package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


public class ProfilesTest {

    private List<Profile> proff = new ArrayList<>();
    private List<Address> expectAll = new ArrayList<>();
    private List<Address> uniq = new ArrayList<>();

    @Before
    public void addAdress() {
        proff.add(new Profile(new Address("Moscow", "Lenina", 1, 1)));
        proff.add(new Profile(new Address("Moscow02", "Lenina02", 2, 2)));
        proff.add(new Profile(new Address("Moscow", "Lenina", 1, 1)));

    }

    @Before

    public void addAddressAll() {
        expectAll.add(new Address("Moscow", "Lenina", 1, 1));
        expectAll.add(new Address("Moscow02", "Lenina02", 2, 2));
        expectAll.add(new Address("Moscow", "Lenina", 1, 1));
    }
    @Before

    public void addAddressUniq() {
        uniq.add(new Address("Moscow", "Lenina", 1, 1));
        uniq.add(new Address("Moscow02", "Lenina02", 2, 2));
    }


    @Test
    public void whenCollectAddress() {
        Profiles prof = new Profiles();
        assertThat(prof.collect(proff), is(expectAll));
    }

    @Test
    public void cwhenCollectUniqAddress() {
        Profiles prof = new Profiles();
        assertThat(prof.collectUniq(proff), is(uniq));
    }
}