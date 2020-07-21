package ru.job4j.ex;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
// класс реализует интерфайс

public class MaibCun implements Input {


    @Override
    public  String nameCats() {
         String name = "Vasy";
             return name;
    }
    public  String nameEx() {
        String name = "EX";
        return name;
    }

}
