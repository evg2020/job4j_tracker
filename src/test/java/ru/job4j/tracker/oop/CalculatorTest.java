package ru.job4j.tracker.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addThreeNumber() {
        Calculator calc = new Calculator();
        double real = calc.add(1, 2, 3);
        double expect =(double) 6;
        assertThat(real, closeTo(expect, 1));

    }
}