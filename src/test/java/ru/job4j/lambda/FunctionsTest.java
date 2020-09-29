package ru.job4j.lambda;

import org.junit.Test;


import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import  java.util.function.*;

public class FunctionsTest {

    @Test
    public void whenLinearFunc() {
        List<Double> result = Functions.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void SquereFunc() {
        List<Double> result = Functions.diapason(5, 7, x -> x*x);
        List<Double> expected = Arrays.asList(25D, 36D);
        assertThat(result, is(expected));
    }

    @Test
    public void exponetFunc() {
        List<Double> result = Functions.diapason(2, 4, x -> (double)3 * ???);
        List<Double> expected = Arrays.asList(9D, 27D);
        assertThat(result, is(expected));
    }
}