package ru.job4j.stream;

import java.util.stream.Stream;
import java.util.stream.Collectors;

enum Suit {
    Diamonds, Hearts, Spaders, Clubs
}

enum Value {
    V_6, V_7, V_8
}

public class Cards {
    private Suit suit;
    private Value value;

    public Cards(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .map(suit -> Stream.of(Value.values())
                        .map(value -> new Cards(suit, value))
                        .collect(Collectors.toList()))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Cards{"
                +
                "suit=" + suit
                +
                ", value=" + value
                +
                '}';
    }
}
