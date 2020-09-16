package ru.job4j.pojo;

import org.w3c.dom.ls.LSOutput;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int firstNull = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                firstNull = i;
                break;
            }
        }
        return firstNull;
    }

    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Milk", 10);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Egg", 19);
//        boolean eq = products[0] == products[1];

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. Т.к. у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());

            }
        }

        int resOfNull = indexOfNull(products);
        System.out.println(resOfNull);
    }

}
