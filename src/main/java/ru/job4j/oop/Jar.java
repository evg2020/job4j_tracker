package ru.job4j.oop;

public class Jar {
    private int value;

     Jar(int size){
        this.value = size;
    }
    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
//        first.value = 11; так тоже задаеться полу экземпляра
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
