package ru.job4j.bank;

import ru.job4j.oop.Object;

import javax.management.MBeanRegistration;
import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/*
1. Регистрировать пользователя.
2. Удалять пользователя из системы.
3. Добавлять пользователю банковский счет.
У пользователя системы могут быть несколько счетов.
4. Переводить деньги с одного банковского счета на другой счет.
*/

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public Optional<User> findByPassport(String passport) {
//        User user = null;
        Optional<User> res =Optional.empty();
        for (User user01 : users.keySet()) {
            if (user01.getPassport().equals(passport)) {
                res = Optional.of(user01);
                break;
            }
        }
        return res;
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport).get();
        List<Account> accountsList = users.get(user);
        if (user != null) {
            if (!users.containsValue(account)) {
                accountsList.add(account);
            }
        }
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> opt = Optional.empty();
//        Account accountUser = null;
        User user = findByPassport(passport).get();
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            for (int i = 0; i < userAccounts.size(); i++) {
                if (userAccounts.get(i).getRequisite().equals(requisite)) {
                    opt = Optional.of(userAccounts.get(i));
                    break;
                }
            }
        }
        return opt;

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean res = false;
        Account account01 = findByRequisite(srcPassport, srcRequisite).get();
        Account account02 = findByRequisite(destPassport, destRequisite).get();
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
        Optional<User> opt = bank.findByPassport("111");
        if (opt.isPresent()) {
            System.out.println(opt.get().getUsername());
        }
    }

}
