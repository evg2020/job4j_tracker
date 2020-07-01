package ru.job4j.oop;
/**
 * @parom position--выбор 1,2 или др.
 * @return println -печатает фразы в зав.от 1, 2 и др
 * */

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox one = new Jukebox();
        int position = 2;
        one.music(position);
    }
}
