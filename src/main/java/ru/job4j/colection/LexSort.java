package ru.job4j.colection;
import java.util.Comparator;

public class LexSort  implements Comparator<String> {

    @Override

    public  int compare(String left, String right) {
        String leftNum = left.split("[.]")[0];
        String riqhtNum = right.split("[.]")[0];
        return Integer.compare(Integer.parseInt(leftNum), Integer.parseInt(riqhtNum));
    }
}
