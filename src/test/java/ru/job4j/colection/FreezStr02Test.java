package ru.job4j.colection;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FreezStr02Test {

    @Test
    public void whenEq() {
        assertThat(FreezStr02.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezStr02.eq("hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezStr02.eq("heloo", "hello"), is(false));
    }
}