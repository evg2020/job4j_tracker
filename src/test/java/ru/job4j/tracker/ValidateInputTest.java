package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class ValidateInputTest {
// правидьный  ввод
    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }
    // правильный ввод

    @Test
    public void whenvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(out.toString(), is("Please enter validate data again"));
    }

    @Test
    public void whenOutPut() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        assertThat(out.toString(), is(1));
    }

}