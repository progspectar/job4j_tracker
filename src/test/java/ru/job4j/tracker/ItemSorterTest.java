package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorterTest {

    @Test
    public void whenSortItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("c"),
                new Item("b"),
                new Item("a")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c")
        );
        Assert.assertEquals(items, expected);
    }

    @Test
    public void whenSortItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("c"),
                new Item("b"),
                new Item("a")
        );
        Assert.assertEquals(items, expected);
    }
}

