package ru.job4j.lambda;

// Класс должен сравнивать имена объектов Attachment.

import java.util.*;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 2", 100),
                new Attachment("image 1", 34),
                new Attachment("image 3", 13)
        );

        System.out.println(attachments);

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };

        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> comparator01 = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };

        attachments.sort(comparator01);
        System.out.println(attachments);

    }
}

