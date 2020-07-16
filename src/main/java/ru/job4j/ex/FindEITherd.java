package ru.job4j.ex;

public class FindEITherd {
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

    public static void main(String[] args) {
        try {
            String[] val = {"q", "l", "h", "d"};
            String key = "0";
            int res = indexOf(val, key);
            System.out.println(res);
        } catch  (ElementNotFoundExeption e) {
                e.printStackTrace();
//            System.out.println(e);
        }
    }
}

