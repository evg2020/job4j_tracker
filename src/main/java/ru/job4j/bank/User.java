package ru.job4j.bank;
//модель пользователя банка.

import java.util.Objects;

public class User {
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public User() {
    }


    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o)  {
        User user = (User) o;
        return passport.equals(user.passport); // сравниваем клиентов только по номеру паспорта
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
