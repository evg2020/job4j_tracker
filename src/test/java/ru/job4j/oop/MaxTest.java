package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void max4Namber() {
        Max res = new Max();
        double result = res.max(2,3,4,6);
        double expect = 6;
        assertThat(result, is(expect));
    }

    @Test
    public void max3Namber() {
        Max res = new Max();
        double result = res.max(2,3,4);
        double expect = 4;
        assertThat(result, is(expect));
    }

}