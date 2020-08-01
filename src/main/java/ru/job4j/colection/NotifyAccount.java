package ru.job4j.colection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public  static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> accountsHash = new HashSet<>();
        for (Account account : accounts) {
            accountsHash.add(account);
        }
        return accountsHash;
    }
}
