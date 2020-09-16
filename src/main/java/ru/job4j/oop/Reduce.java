package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static void main(String[] args) {
        Reduce reduce = new Reduce();
        int[] array = {1, 2, 3};
        reduce.setArray(array);
        reduce.print();
    }
}