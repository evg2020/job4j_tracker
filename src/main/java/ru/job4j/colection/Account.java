package ru.job4j.colection;

import java.util.Objects;

public class Account {
    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Account{"
                + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + ", deposit='" + deposit + '\''
                + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport, username);
    }

    @Override
    public boolean equals(Object o) {
              Account account = (Account) o;
        return passport.equals(account.passport);
    }
}
