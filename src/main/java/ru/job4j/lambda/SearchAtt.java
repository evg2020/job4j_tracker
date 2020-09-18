package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class SearchAtt {
    public static List<Attachment> filter(List<Attachment> list, int value) {
        Predicate<Attachment> predicate = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > value;
            }
        };
        return loop(list, predicate);
    }

    public static List<Attachment> filter(List<Attachment> list, String value) {
        Predicate<Attachment> predicate = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains(value);
            }
        };
        return loop(list, predicate);
    }

    private static List<Attachment> loop(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> result = new ArrayList<>();
        for (Attachment att : list) {
            if (predicate.test(att)) {
                result.add(att);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Attachment> list = Arrays.asList(
                new Attachment("AA bugg", 11),
                new Attachment("bug", 22),
                new Attachment("zz bug", 133)
        );
        List<Attachment> lists = filter(list, "bug");
        for (Attachment at : lists) {
            System.out.println(at);
        }
    }
}