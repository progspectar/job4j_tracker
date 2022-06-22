package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when35to17then2dot82() {
        double expected = 2.82;
        Point a = new Point(3, 5);
        Point b = new Point(1, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51to63then2dot23() {
        double expected = 2.23;
        Point a = new Point(5, 1);
        Point b = new Point(6, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to71then3dot16() {
        double expected = 3.16;
        int x1 = 4;
        int y1 = 2;
        int x2 = 7;
        int y2 = 1;
        Point a = new Point(4, 2);
        Point b = new Point(7, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}

