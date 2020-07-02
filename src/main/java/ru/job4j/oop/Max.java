package ru.job4j.oop;
// 3. Перегрузить метод max для трех чисел [#299294]

public class Max {
    public int max(int arg1, int arg2) {
        int res = (arg1 > arg2) ? arg1 : arg2;
        return res;
    }

    public int max(int arg1, int arg2, int arg3) {
        return max(max(arg1, arg2), arg3);
    }

    public int max(int arg1, int arg2, int arg3, int arg4) {
        return max(max(arg1, arg2), max(arg3, arg4));
    }

    public static void main(String[] args) {
        Max res = new Max();
        System.out.println("Max = " + res.max(2, 3, 4, 6));
    }
}