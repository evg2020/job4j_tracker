package ru.job4j.tracker;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.is;


public class StartUITest {



 /*   @Test
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
            Input in = new StubInput(
                    new String[] {"0", "Replaced item", "1", "1", "New item name", "2"}
            );
            UserAction[] actions = {
                     new CreateItem(),
                     new EditItem(),
                     new ExitProgram()
            };
            new StartUI().init(in, tracker, actions);
            Item repleced = tracker.findById(1);
            String expected = "New item name";
            assertThat(repleced.getName(), is(expected));
        }

    @Test
    public void whenReplaceItemSecond() {

        Tracker tracker = new Tracker();
        *//* Добавим в tracker новую заявку *//*
            *//*Item item = new Item();
            item.setName("new Item");
            tracker.add(item)*//*
        Item item = tracker.add(new Item("Replaced item"));
        *//* Входные данные должны содержать ID добавленной заявки item.getId() *//*
//            String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0",  "1", "New item name", "1"}
        );
        UserAction[] actions = {
                new EditItem(),
                new ExitProgram()
        };
        new StartUI().init(in, tracker, actions);
        Item repleced = tracker.findById(item.getId());
        String actial = repleced.getName();
        String expected = "New item name";
        assertThat(actial, is(expected));
    }
    @Test
    public void whenDeleteItem() {
            Tracker tracker = new Tracker();
            *//* Добавим в tracker новую заявку *//*
           *//* Item item = new Item();
            item.setName("new Item");
            tracker.add(item)*//*
            Item item = tracker.add(new Item("Deleted item"));
            *//* Входные данные должны содержать ID добавленной заявки item.getId() *//*
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
*/

  /*  Сценарий теста.

            1. Трекер загружается с одним действием - "выйти".
            2. На консоль выводится пункт "Выйти".
            3. В тесте проверяем, что StubInput содержит вывод меню.*/

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitProgram()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit Program " + System.lineSeparator()
        ));
    }
}
