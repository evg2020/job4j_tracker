package ru.job4j.ex;

public class Cat {
 public void nameIs(Input cat) {
     String  v = cat.nameCats();
     System.out.println(v);

 }

    public static void main(String[] args) {
        Cat car = new Cat();
       Input cat = new MaibCun();
        car.nameIs(cat);
//       car.nameIs(new MaibCun());


       car.nameIs(new Black());

        MaibCun cat01 = new MaibCun();
        System.out.println(cat01.nameEx());
    }
}
