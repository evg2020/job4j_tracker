package ru.job4j.tracker;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.is;


public class StartUITest {



    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateItem(),
                new ExitProgram()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {

                    Tracker tracker = new Tracker();
             /* Добавим в tracker новую заявку */
            /*Item item = new Item();
            item.setName("new Item");
            tracker.add(item)*/
            Item item = tracker.add(new Item("Replaced item"));
            item.setId(1);
            /* Входные данные должны содержать ID добавленной заявки item.getId() */
            Item replacedName = new Item("New item name");
            replacedName.setId(1);
//            String replacedName = "New item name";
            Input in = new StubInput(
                    new String[] {"0",  "1", "New item name", "1"}
            );
            UserAction[] actions = {
                     new EditItem(),
                    new ExitProgram()
            };
            new StartUI().init(in, tracker, actions);
            assertThat(tracker.findById(item.getId()), is(replacedName));
        }

    @Test
    public void whenDeleteItem() {
            Tracker tracker = new Tracker();
            /* Добавим в tracker новую заявку */
           /* Item item = new Item();
            item.setName("new Item");
            tracker.add(item)*/
            Item item = tracker.add(new Item("Deleted item"));
            /* Входные данные должны содержать ID добавленной заявки item.getId() */
            Input in = new StubInput(
                    new String[] {"0", "1", "1"}
            );
            UserAction[] actions = {
                    new DeleteItem(),
                    new ExitProgram()
            };
            new StartUI().init(in, tracker, actions);
            assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}
