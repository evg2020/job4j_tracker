package ru.job4j.seach;

import java.util.LinkedList;
import java.util.*;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    public LinkedList<Task> getTasks() {
        return tasks;
    }

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() < task.getPriority()) {
                index += 1;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {
        PriorityQueue queqe = new PriorityQueue();
        queqe.put(new Task("low", 5));
        queqe.put(new Task("urgent", 1));
        queqe.put(new Task("middle", 3));

        for (Object ln : queqe.getTasks()) {
            System.out.println(ln.toString());
        }
    }

}
