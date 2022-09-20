package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализует операции с банковскими счетами и пользователями
 *
 * @author PAVEL ZOTOV
 * @version 1.0
 */
public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним банковскими счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему
     *
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = getAccounts(user);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя
     *
     * @param passport по номеру паспорта
     * @return возвращает найденного пользователя или null, если пользователь не найден
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет банковский счет по номеру паспорта пользователя и реквизитам банковского счета
     *
     * @param passport  номер паспорта пользователя
     * @param requisite реквизиты банковского счета
     * @return возвращает найденный банковский счет или null, если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = getAccounts(user);
            for (Account account : accountList) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит деньги с одного банковского счета на другой
     * Сначала ищем счет-отправитель и счет-получатель,
     * затем проверяем что сумма перевода  не больше остатка на счете-отправителе
     *
     * @param srcPassport   номер паспорта отправителя
     * @param srcRequisite  реквизиты счета отправителя
     * @param destPassport  номер паспорта получателя
     * @param destRequisite реквизиты счета получателя
     * @param amount        сумма перевода
     * @return возвращает true в случае успешного перевода либо false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
        return false;
    }

    /**
     * Метод возвращает список счетов, существующих у данного пользователя
     *
     * @param user пользователь - владелец счетов
     * @return список банковских счетов,  существующих у данного пользователя, либо null счета не найдены
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}