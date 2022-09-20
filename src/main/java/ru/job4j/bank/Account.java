package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает банковский счет пользователя
 *
 * @author PAVEL ZOTOV
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты банковского счета пользователя
     */
    private String requisite;
    /**
     * Баланс банковского счета пользователя
     */
    private double balance;

    /**
     * Конструктор класса принимает параметры
     *
     * @param requisite Реквизиты счета
     * @param balance   Баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * @return возвращает реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * устанавливает реквизиты счета
     *
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * @return возвращает баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * устанавливает баланс счета
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * переопределение метода, унаследованного от Object
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * переопределение метода, унаследованного от Object
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}