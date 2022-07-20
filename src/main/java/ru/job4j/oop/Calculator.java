package ru.job4j.oop;

public class Calculator {

    private static final int X = 5;

    public static int sum(int y) {
        return X + y;
    }

    public static int minus(int y) {
        return y - X;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        rsl = calculator.divide(5);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(5);
        System.out.println(rsl);
        rsl = sum(5);
        System.out.println(rsl);
        rsl = minus(5);
        System.out.println(rsl);
    }

    public int multiply(int a) {
        return X * a;
    }

    public int divide(int y) {
        return y / X;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }
}