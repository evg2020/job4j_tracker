package ru.job4j.colection;

import java.util.Objects;

public class Citizen {
    private String passport;
    private String username;

    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        Citizen citizen = (Citizen) o;
        return passport.equals(citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Citizen{"
                +
                "passport='" + passport + '\''
                +
                ", username='" + username + '\''
                +
                '}';
    }
}
