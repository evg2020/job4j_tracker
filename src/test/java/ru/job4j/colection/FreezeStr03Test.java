package ru.job4j.colection;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FreezeStr03Test {

    @Test
    public void whenEq() {
        assertThat(FreezeStr03.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezeStr03.eq("hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr03.eq("heloo", "hello"), is(false));
    }
}