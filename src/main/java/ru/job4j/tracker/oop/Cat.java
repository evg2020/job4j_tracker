package ru.job4j.tracker.oop;

public class Cat {
   private  String food;
   private  String name;
   public void show() {
       System.out.println("There are food of cat " + this.name + " - " + this.food);
          }

   public  void eat(String meal) {
       this.food = meal;
    }
    public void giveNick(String nick) {
       this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick(" Gav");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick(" Black ");
        black.show();



    }
}
