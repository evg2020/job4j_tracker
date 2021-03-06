package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

public class License {

    private String owner;
    private String model;
    private String code;
    private Date created;

    @Override
    public boolean equals(Object o) {
        License license = (License) o;
        return Objects.equals(code, license.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, code);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public static void main(String[] args) {
        License lic01 = new License();
        lic01.code = "audio";
        lic01.setModel("Ferrari");
        License lic02 = new License();
        lic02.setCode("audio");
        boolean lice = lic01.equals(lic02); // сравнение по полям code
        System.out.println(lice);
    }

}
