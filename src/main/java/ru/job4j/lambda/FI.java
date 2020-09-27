package ru.job4j.lambda;

import java.util.Comparator;
import java.util.Arrays;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 200),
                new Attachment("image 2", 100),};

        // Было с ананимным классом
       /* Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize()- right.getSize();
            }
        };*/
        // Стало с Лябда выражением

        Comparator<Attachment> comparator = (left, right) -> {
            System.out.println("compare " + left.getSize() + ":" + right.getSize());
            return right.getSize() - left.getSize();
        };

        Arrays.sort(atts, comparator);


    }
}
