package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class NotifyAccountTest {
    @Test
    public void whenTwoAccountsAddSent() {
        NotifyAccount notifyAccount = new NotifyAccount();
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(notifyAccount.sent(accounts)).containsAll(expect);
    }

    @Test
    public void whenDuplicatesIsDeleted() {
        NotifyAccount notifyAccount = new NotifyAccount();
        HashSet<Account> accounts = NotifyAccount.sent(Arrays.asList(
                new Account("111", "Petr Arsentev", "1"),
                new Account("111", "Pavel Zotov", "2"),
                new Account("222", "Pavel Zotov", "3")
        ));
        HashSet<Account> expect = new HashSet<Account>(
                Arrays.asList(
                        new Account("111", "Petr Arsentev", "1"),
                        new Account("222", "Pavel Zotov", "3")
                )
        );
        assertIterableEquals(accounts, expect);
    }
}