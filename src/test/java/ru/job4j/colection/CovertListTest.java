package ru.job4j.colection;

import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CovertListTest {

    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[]{1, 2});
        in.add(new int[]{3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(CovertList.convert(in), is(expect));
    }
}