package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает  пользователя банка
 *
 * @author PAVEL ZOTOV
 * @version 1.0
 */
public class User {
    /**
     * номер паспорта пользователя банка
     */
    private String passport;
    /**
     * Фамилия Имя Отчество пользователя банка
     */
    private String username;

    /**
     * конструктор класса принимает параметры
     *
     * @param passport номер паспорта пользователя
     * @param username фамилия имя отчество пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * @return возвращает номер паспорта пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * устанвливает номер паспорта пользователя
     *
     * @param passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * @return возвращает  ФИО пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * устанавливает имя пользователя
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}