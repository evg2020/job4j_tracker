package ru.job4j.lambda;
//Программа должна выводить задачи с scope > 30.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class Stream {
    public static class Task {
        private final String name;
        private final long spend;

        public Task(String name, long spend) {
            this.name = name;
            this.spend = spend;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 30),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        );
        tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spend > 30)
                .map(task -> task.name + " " + task.spend)
                .forEach(System.out::println);
    }
}


