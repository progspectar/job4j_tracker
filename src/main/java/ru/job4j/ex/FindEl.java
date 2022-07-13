package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (Objects.equals(value[i], key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Element: " + key + " is not found");
    }

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        try {
            System.out.println("Index of b is: " + indexOf(array, "b"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Index of e is: " + indexOf(array, "e"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}