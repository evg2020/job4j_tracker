package ru.job4j.ex;

public class FindEISecond {
    public  static int indexOf(String[] value, String key) {

        int res = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                res = i;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args)  {
        ElementNotFoundExeption elem =new ElementNotFoundExeption("There are not any equal char");
        try {
            String[] val = {"q", "l", "h", "d"};
            String key = "x";
            int res = indexOf(val, key);
            System.out.println(res);
        } catch  (ElementNotFoundExeption) {
//                e.printStackTrace();//
            System.out.println(elem);
        }
    }
}


