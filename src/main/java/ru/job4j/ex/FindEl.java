package ru.job4j.ex;
/*
Создайте класс ru.job4j.ex.ElementNotFoundException.
Класс должен наследоваться от java.lang.Exception.
       2. Допишите метод поиска индекса элемента в строковом массиве.
        3. Если элемента нет, то нужно выкинуть исключение ElementNotFoundException.
        В сингатуре метода объявить это исключение.
        4. Добавьте метод main, и в нем вызовите метод indexOf.
        В методе main используйте конструкцию try-catch
*/

import org.w3c.dom.ls.LSOutput;

public class FindEl {
    public  static int indexOf(String[] value, String key) throws ElementNotFoundExeption{

        int res = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                res = i;
                break;
            }
        }
        if (res == -1) {
            throw new ElementNotFoundExeption("There are not any equal char");
        }
        return res;
    }

    public static void main(String[] args) {
            try {
            String[] val = {"q", "l", "h", "d"};
            String key = "0";
            int res = indexOf(val, key);
            System.out.println(res);
            } catch  (ElementNotFoundExeption e) {
                e.printStackTrace();
                System.out.println(e);
                }
        }
    }

