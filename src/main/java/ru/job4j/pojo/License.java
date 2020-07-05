package ru.job4j.pojo;
import java.util.Date;
import java.util.Objects;

public class License {

    private String owner;
    private String model;
    private String code;
    private Date created;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        License license = (License) o;
        return  code.equals(license.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }

    //переопределяем метод для сравнения определенных полей обьекта класса License;

/*
    public boolean equals(License that) {
        return this.code == that.code;
        }*/

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
