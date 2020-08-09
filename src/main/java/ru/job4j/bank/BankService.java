package ru.job4j.bank;

import ru.job4j.oop.Object;

import javax.management.MBeanRegistration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public User findByPassport(String passport) {
        User user = null;
        for (User user01 : users.keySet()) {
            if (user01.getPassport().equals(passport)) {
                user = user01;
            }
        }
        return user;
    }

    public void addAccount(String passport, Account account) {
        if (findByPassport(passport) != null) {
            User user = findByPassport(passport);
            List<Account> accounts = users.get(user);
            if (!users.containsValue(accounts)) {
                accounts.add(account);
            }
        }
    }


    public Account findByRequisite(String passport, String requisite) {
        Account accountUser = null;
        User user = findByPassport(passport);
        List<Account> userAccounts = users.get(user);
        for (int i = 0; i < userAccounts.size(); i++) {
            if (userAccounts.get(i).getRequisite().equals(requisite)) {
                accountUser = userAccounts.get(i);

            }
        }
        return accountUser;
    }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean res = false;
        return res;
    }

}
