package ru.job4j.colection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import  java.util.List;
import java.util.HashSet;
import java.util.Arrays;


public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001"),
                new Account("142", "Petr Arsentev", "000002")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}