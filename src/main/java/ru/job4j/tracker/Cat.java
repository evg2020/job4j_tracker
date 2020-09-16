package ru.job4j.tracker;

import org.w3c.dom.ls.LSOutput;

public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{"
                +
                "name='" + name + '\''
                +
                '}';
    }

    public static void main(String[] args) {

        Cat[] cats = {new Cat("Tomas"), new Cat(), new Cat()};
        Cat cat = cats[0];

        /*cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");*/
//        Cat cats = cats[1];
        for (int i = 0; i < 3; i++) {
            System.out.println(cats[i]);
            System.out.println(cat.name);
        }
        System.out.println("===All item===" + System.lineSeparator()
                + "Item{id=1, name='New Name'}" + System.lineSeparator());
    }
}
