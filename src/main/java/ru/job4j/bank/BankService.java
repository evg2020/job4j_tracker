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
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        } else {
            System.out.println("Client is already on the base");
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List accounts = users.get(user);
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) != account) {
                accounts.add(account);
            } else {
                System.out.println("Account is already base");

            }
        }



    }

    public User findByPassport(String passport) {
        User user = null;
          for (User users : users.keySet()) {
            if (users.getPassport() == passport) {
                user = users;
            }

        }
        return user;
    }


    public Account findByRequisite(String passport, String requisite) {
        Account accountUser = null;
        List<Account> userAccounts = users.get(passport);
        for (int i = 0; i < userAccounts.size(); i++) {
            if (userAccounts.get(i).getRequisite() == requisite) {
                accountUser = userAccounts.get(i);
                break;
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
