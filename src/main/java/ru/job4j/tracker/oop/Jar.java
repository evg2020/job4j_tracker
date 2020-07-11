package ru.job4j.tracker.oop;

public class Jar {

    private int volume;

    public Jar(int size) {
        this.volume = size;
    }

    public void pour(Jar anather) {
        this.volume = this.volume + anather.volume;
        anather.volume = 0;
            }

    public static void main(String[] args) {
        Jar jar01 = new Jar(10);
        Jar jar02 = new Jar(5);
        Jar jar03 = new Jar(15);
        System.out.println(jar01.volume + " "+ jar02.volume);
        jar01.pour(jar03);
        System.out.println(jar01.volume + " "+ jar02.volume);
    }
}
