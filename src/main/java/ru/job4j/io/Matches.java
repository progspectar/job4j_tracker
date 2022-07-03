package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            while (!validate(matches, count)) {
                System.out.println("Ошибка, введите число от от 1 до 3 (включительно) "
                        + "и не больше числа оставшихся спичек: " + count);
                matches = Integer.parseInt(input.nextLine());
            }
            count = count - matches;
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

    static boolean validate(int matches, int count) {
        int test = 1;
        return matches >= 1 && matches <= Math.max(3, count);
    }
}
