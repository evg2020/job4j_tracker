package ru.job4j.pojo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class LicenseTest {

        @Test
        public void whenAudioThenTrue() {
            License first = new License();
            first.setCode("audio");
            License second = new License();
            second.setCode("audio");
          /*  boolean res = first.equals(second);
            boolean expect = true;
            assertThat(res, is(expect));*/
            assertThat(first, is(second));
    }
}