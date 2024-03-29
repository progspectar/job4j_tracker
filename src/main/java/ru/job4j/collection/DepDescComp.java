package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int res = o2.split("/", 2)[0].compareTo(o1.split("/", 2)[0]);
        return res == 0 ? o1.compareTo(o2) : res;
    }
}