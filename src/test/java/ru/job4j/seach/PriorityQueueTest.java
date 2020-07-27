package ru.job4j.seach;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PriorityQueueTest {

@Test
    public void whenHighPriority() {
        PriorityQueue queqe = new PriorityQueue();
        queqe.put(new Task("low", 5));
        queqe.put(new Task("urgent", 1));
        queqe.put(new Task("middle", 3));
        Task res = queqe.take();
        assertThat(res.getDesc(), is("urgent"));
        }
    }



