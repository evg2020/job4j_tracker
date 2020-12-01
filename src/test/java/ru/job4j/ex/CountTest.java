package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CountTest {
    @Test(expected = IllegalArgumentException.class)
    public void addwhenStartGreaterThenException() {
        Count.add(5, 4);
    }

    @Test(expected = NullPointerException.class)
    public void addWhenStarZerroTheException() {
        Count.add(0, 4);
    }

    @Test
    public void addWhenStart() {
        Count count = new Count();
        int res = count.add(1, 4);
        assertThat(res, is(6));
    }
}