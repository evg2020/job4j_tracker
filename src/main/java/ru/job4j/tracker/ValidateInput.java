package ru.job4j.tracker;
    /* 1. Мы вызываем метод суперкласса (ConsoleInput) и присваиваем значение которое
     вернул метод askInt этого класса
  2. Там используется цикл do while, который гарантирует,
   что хотя бы один раз этот цикл выполнится.
   ЧТобы из него выйти - как раз и используется переменная invalid.
   Т.е. если все хорошо отработает с первого раза - присвоится значение false и программа выйдет из этого цикла.
   Если же программа отработает с ошибкой - например вы введете текст вместо цифры - будет брошено исключение NumberFormatException
    и программа перейдет в блок catch - значение invalid не изменится, вы вернетесь на начало цикла, т.е. на повторный ввод с консоли.
     Т.е. программа будет работать стабильно и не будет кидать исключение.

 */

public class ValidateInput implements Input {
    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
                        } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}

