package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.closeTo;

public class PointTest {

    @Test
    public void distance3dWhenA002B002Then() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double res = a.distance3d(a, b);
        double expect = 2;
        assertThat(res, closeTo(expect, 0.001));

    }
}