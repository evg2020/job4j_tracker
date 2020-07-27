package ru.job4j.seach;

import java.util.LinkedList;
import java.util.*;

public class PriorityQueue {
    private  LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
            for (Task element : tasks) {
                int priorLast = 0;
                if (element.getPriority() < task.getPriority()) {
                    index += 1;
                }
            }
        this.tasks.add(index, task);
     }

    public  Task take() {
        return tasks.poll();
    }
}
