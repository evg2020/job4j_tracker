package ru.job4j.tracker;

import org.junit.Test;
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
        Item item = new Item();
        item.setName("Bug");
        tracker.add(item);
        String name = item.getName();
        tracker.findByName("Bug");
        assertThat(tracker.findByName("Bug")[0].getName(), is("Bug"));
    }
}

