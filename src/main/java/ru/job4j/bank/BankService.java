package ru.job4j.bank;

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
//        User user = null; //Чтобы обернуть null используем метод ниже
        Optional<User> res = Optional.empty();
        for (User user01 : users.keySet()) {
            if (user01.getPassport().equals(passport)) {
                res = Optional.of(user01); //Чтобы обернуть not-null значение используем метод
                break;
            } else {
                System.out.println("нет пользователя с таким паспортом");
            }
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
        Optional<Account> opt = Optional.empty();
        Optional<User> optUser = findByPassport(passport);
        if (optUser.isPresent()) {
            User user = optUser.get();
            List<Account> userAccounts = users.get(user);
            for (int i = 0; i < userAccounts.size(); i++) {
                if (userAccounts.get(i).getRequisite().equals(requisite)) {
                    opt = Optional.of(userAccounts.get(i));
                    break;
                } else {
                    System.out.println("нет такого счета");
                }
            }
        }
        return opt;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean res = false;
        Optional<Account> optAccount01 = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> optAccount02 = findByRequisite(srcPassport, srcRequisite);
/* убрано кидание исключения
        Account account01 = findByRequisite(srcPassport, srcRequisite)
                .orElseThrow(() -> new NullPointerException("проверьте №паспорта и счета "));
        Account account02 = findByRequisite(destPassport, destRequisite)
                .orElseThrow(() -> new NullPointerException("проверьте №паспорта и счета "));*/

        if (optAccount01.isPresent() && optAccount02.isPresent()) {
            Account account01 = optAccount01.get();
            Account account02 = optAccount02.get();
            if (account01.getBalance() >= amount) {
                double newBalance = account02.getBalance() + amount;
                double changedBalance = account01.getBalance() - amount;
                account02.setBalance(newBalance);
                account01.setBalance(changedBalance);
                res = true;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser((new User("2222", "Petr Arsentev")));
        Optional<User> opt = bank.findByPassport("222");
        System.out.println(opt);

        System.out.println();


        bank.addAccount("2222", new Account("5555", 150D));
        Optional<Account> optionalAccount = bank.findByRequisite("2222", "5551");
        System.out.println(optionalAccount.toString());
    }

}
