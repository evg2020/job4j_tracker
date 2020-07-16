package ru.job4j.ex;
/*исправить проблему нужно добавить в метод блок
        if else, если n == 0 или n == 1,
        то нужно вернуть значение return 1,
         иначе нужно запустить рекурсию calc(n - 1) * n.
*/
public class FactRec {
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calc(n - 1);
    }

    public static void main(String[] args) {
        int rsl = calc(4);
        System.out.println(rsl);
    }
}
