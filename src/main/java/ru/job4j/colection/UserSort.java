package ru.job4j.colection;
import java.util.*;

public class UserSort {
    public List<User> sort(List<User> users) {
        Collections.sort(users, new SoftByName());
        return  users;
    }
}
