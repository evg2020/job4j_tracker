package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void eat(String eat) {
        this.food = eat;
    }

    public void giveNick(String name) {
        this.name = name;
    }

     public void show() {
         System.out.println(this.food + "" + this.name);
     }

    public String sound(){
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy say " + say);
        peppy.eat("Salyamy");
        peppy.show();

    }
}
