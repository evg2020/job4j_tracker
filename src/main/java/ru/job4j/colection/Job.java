package ru.job4j.colection;

public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{"
                +
                "name='" + name + '\''
                +
                ", priority=" + priority
                +
                '}';
    }
/*

    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
*/

    @Override
    public int compareTo(Job anather) {
        return Integer.compare(priority, anather.priority);
    }
}