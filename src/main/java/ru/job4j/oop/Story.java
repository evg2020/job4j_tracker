package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer pyatia = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(pyatia);
        wolf.eat(girl);
        pyatia.kill(wolf);
    }
}
