package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToEng(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String dicWord = "English";
        String eng = dic.engToEng(dicWord);
        System.out.println("Неизвестное слово " + eng);
    }
}
