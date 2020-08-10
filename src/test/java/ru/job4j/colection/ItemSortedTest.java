package ru.job4j.colection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ItemSortedTest {

    @Test
    public void whenSortInIncrease() {
        ItemSorted sorts = new ItemSorted();

        List<Item> items = Arrays.asList(
                new Item(7, "Ivan"),
                new Item(3, "VAnya"),
                new Item(5, "ARoma") );

        List<Item> expect = Arrays.asList(
                new Item(3, "VAnya"),
                new Item(5, "ARoma"),
                new Item(7, "Ivan"));
        assertThat(sorts.sort(items), is(expect));
    }

    @Test
    public void whenSortToDecrease() {
        ItemSorted sorts = new ItemSorted();

        List<Item> items = Arrays.asList(
                new Item(7, "Ivan"),
                new Item(3, "VAnya"),
                new Item(5, "ARoma") );

        List<Item> expect = Arrays.asList(

                new Item(7, "Ivan"),
                new Item(5, "ARoma"),
                new Item(3, "VAnya") );
        assertThat(sorts.sortReverse(items), is(expect));
    }

    @Test
    public void whenSortVyName() {
        ItemSorted sorts = new ItemSorted();

        List<Item> items = Arrays.asList(
                new Item(7, "Ivan"),
                new Item(3, "VAnya"),
                new Item(5, "ARoma")
        );

        List<Item> expect = Arrays.asList(
                new Item(5, "ARoma"),
                new Item(7, "Ivan"),
                new Item(3, "VAnya")


        );
        assertThat(sorts.sortByName(items), is(expect));
    }

    @Test
    public void whenSortVyNameReverse() {
        ItemSorted sorts = new ItemSorted();

        List<Item> items = Arrays.asList(
                new Item(7, "Ivan"),
                new Item(3, "VAnya"),
                new Item(5, "ARoma")
        );

        List<Item> expect = Arrays.asList(
                new Item(3, "VAnya"),
                new Item(7, "Ivan"),
                new Item(5, "ARoma")



        );
        assertThat(sorts.sortByNameReverse(items), is(expect));
    }
}