package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {

        Product[] prods = new Product[3];

        Product milk = new Product("milk", 10);
        Product bread = new Product("bread", 20);
        Product egg = new Product("egg", 5);
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;
        for (int i = 0; i < prods.length; i++) {
            Product res = prods[i];
            System.out.println(res.getName() + " - " + res.getCount());
        }
//        System.lineSeparator();
        System.out.println("Shown only product.count > 10");
        for (int i = 0; i < prods.length; i++) {
            Product res = prods[i];
            if (res.getCount() > 9) {
                System.out.println(res.getName() + " - " + res.getCount());
            }
        }
        System.out.println("Shown only product.name egg");
        for (int i = 0; i < prods.length; i++) {
            Product res = prods[i];
            if (res.getName().equals("egg")) {
                System.out.println(res.getName() + " - " + res.getCount());

            }

        }
    }

}
