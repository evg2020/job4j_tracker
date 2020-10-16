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
        return users.keySet().stream()
                .filter(use -> use.getPassport().equals(passport))
                .findFirst();

    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport)
                .orElseThrow(() -> new NullPointerException("нет пользователя с таким паспортом"));
        List<Account> accountsList = users.get(user);
        if (user != null) {
            if (!users.containsValue(account)) {
                accountsList.add(account);
            }
        }
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {

        Optional<Account> optAcc = Optional.empty();
        User user = findByPassport(passport)
                .orElseThrow(() -> new NullPointerException("нет пользователя с таким паспортом"));
        if (user != null) {
            optAcc = users.get(user).stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();

        }
        return optAcc;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean res = false;
        Account account01 = findByRequisite(srcPassport, srcRequisite)
                .orElseThrow(() -> new NullPointerException("проверьте №паспорта и счета "));
        Account account02 = findByRequisite(destPassport, destRequisite)
                .orElseThrow(() -> new NullPointerException("проверьте №паспорта и счета "));

        if (account01 != null && account02 != null && account01.getBalance() >= amount) {
            double newBalance = account02.getBalance() + amount;
            double changedBalance = account01.getBalance() - amount;
            account02.setBalance(newBalance);
            account01.setBalance(changedBalance);
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser((new User("2222", "Petr Arsentev")));

        Optional<User> opt = bank.findByPassport("11");
        if (opt.isPresent()) {
            System.out.println(opt.get().getUsername());
        } else {
            System.out.println(Optional.empty());
        }
    }

}
