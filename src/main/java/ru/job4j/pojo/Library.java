package ru.job4j.pojo;
//3. Массивы и модели. [#299314]

import java.time.format.ResolverStyle;

public class Library {
    public static void main(String[] args) {

    Book book01 = new Book("Nemo", 100);
    Book book02 = new Book("GenerationPi", 300);
    Book book03 = new Book("Bochki i Obruchi", 500);
    Book book04 = new Book("Clean code", 350);
    Book[] books = new Book[4];
    books[0] = book01;
    books[1] = book02;
    books[2] = book03;
    books[3] = book04;
        for (int i = 0; i < books.length; i++) {
            Book bookTemp = books[i];
            System.out.println(books[i].getName()
                    + " стр- " + bookTemp.getPages());
             }

        System.out.println();
        System.out.println(" Меняем местами книги 3 и 1");
        Book temp = books[0];
        books[0] = books[2];
        books[2] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bookTemp = books[i];
            System.out.println(bookTemp.getName()
                    + " стр- " + bookTemp.getPages());
            }

        System.out.println();
        System.out.println(" книги с именем Clean Code");

        for (int i = 0; i < books.length; i++) {
            Book bookTemp = books[i];
            if (bookTemp.getName().equals("Clean code")) {
                System.out.println(bookTemp.getName());
                }
            }
        }
}
