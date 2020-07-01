package ru.job4j.oop;

public class Cat {
   public String sound() {
       String voice = "May-May";
       return voice;
   }

    public static void main(String[] args) {
        Cat pappy = new Cat();
        String res = pappy.sound();
        System.out.println("Cat  pappy saied " + res);
    }
}
