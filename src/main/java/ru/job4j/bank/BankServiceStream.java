package ru.job4j.bank;

import java.util.*;

/*
1. Регистрировать пользователя.
2. Удалять пользователя из системы.
3. Добавлять пользователю банковский счет.
У пользователя системы могут быть несколько счетов.
4. Переводить деньги с одного банковского счета на другой счет.


Дело в том, что при использовании Optional мы избегаем работу с null значениями,
        при этом среда разработки нам будет всячески подсказывать
        что код неоптимален и некоторые методы надо переписать,
        поскольку может быть нулевое значение.
        если мы работаем с null - то такие моменты не столь очевидны
         */

public class BankServiceStream {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> res = Optional.empty();
        Optional<User> optUser = users.keySet().stream()
                .filter(use -> use.getPassport().equals(passport))
                .findFirst();
        if (optUser.isPresent()) {
            res = optUser;
        } else {
            System.out.println("нет пользователя с таким паспортом");

        }
        return res;
    }

    public void addAccount(String passport, Account account) {
        Optional<User> optUser = findByPassport(passport);
        if (optUser.isPresent()) {
            User user = optUser.get();
            List<Account> accountsList = users.get(user);
            if (!users.containsValue(account)) {
                accountsList.add(account);
            }
        }
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {

        Optional<Account> optAcc = Optional.empty();
        Optional<User> optUser = findByPassport(passport);
        if (optUser.isPresent()) {
            User user = optUser.get();
            optAcc = users.get(user).stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();

        }
        return optAcc;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean res = false;
        Optional<Account> optAccount01 = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> optAccount02 = findByRequisite(srcPassport, srcRequisite);
        if (optAccount01.isPresent() && optAccount02.isPresent()) {
            Account account01 = optAccount01.get();
            Account account02 = optAccount02.get();
            if (optAccount02.isPresent()) {

                if (account01.getBalance() >= amount) {
                    double newBalance = account02.getBalance() + amount;
                    double changedBalance = account01.getBalance() - amount;
                    account02.setBalance(newBalance);
                    account01.setBalance(changedBalance);
                    res = true;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BankServiceStream bank = new BankServiceStream();
        bank.addUser((new User("2222", "Petr Arsentev")));
        Optional<User> opt = bank.findByPassport("22");
        System.out.println(opt);

        bank.addAccount("2222", new Account("5555", 150D));
        Optional<Account> optionalAccount = bank.findByRequisite("2221", "5551");
        System.out.println(optionalAccount.toString());
    }

}


