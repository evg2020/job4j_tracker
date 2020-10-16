package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private int score; // Проходной балл
    private String name; //ФИО

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return  name;
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "score=" + score
                +
                ", name='" + name + '\''
                +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }
}
