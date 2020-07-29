package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("New Item");
        tracker.add(bug);
        int id = bug.getId();
        Item replaced = new Item();
        replaced.setName("replaced item");
        tracker.replace(id, replaced);
        assertThat(tracker.findById(id).getName(), is("replaced item"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("new Item");
        tracker.add(item);
        int id = item.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item01 = new Item();
        item01.setName("Bug");
        Item item02 = new Item();
        item02.setName("Bug");
        tracker.add(item01);
        tracker.add(item02);
        String name = item01.getName();
        Item find = (Item) tracker.findByName("Bug").get(0); // Перевод из Object to Item
        tracker.findByName("Bug"); // находит список
        assertThat(((Item) tracker.findByName("Bug").get(0)).getName(), is("Bug"));
    }
}

