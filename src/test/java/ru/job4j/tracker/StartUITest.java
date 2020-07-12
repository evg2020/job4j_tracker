package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddTest() {
        String[] answer ={"FixPC"};
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item();
        expected.setName("FixPC");
        assertThat(created.getName(), is((expected.getName())));
    }
}
