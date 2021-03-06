package ru.job4j.colection;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private  Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
          User user = (User) o;
        return age == user.age
                &&   Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
