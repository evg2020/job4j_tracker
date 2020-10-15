package ru.job4j.bank;
//модель банковского счета.

import java.util.Objects;

public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Account account = (Account) o;
            return Double.compare(account.balance, balance) == 0
                    && requisite.equals(account.requisite);
          }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    @Override
    public String toString() {
        return "Account{" +
                "requisite='" + requisite + '\'' +
                ", balance=" + balance +
                '}';
    }
}
