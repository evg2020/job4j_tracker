package ru.job4j.ex;

public class FindEISecond {
    public  static int indexOf(String[] value, String key) throws ElementNotFoundExeption {

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

    public static void main(String[] args)  throws ElementNotFoundExeption{

            String[] val = {"q", "l", "h", "d"};
            String key = "g";
            int res = indexOf(val, key);
            System.out.println(res);

    }
}