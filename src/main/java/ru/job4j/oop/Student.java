package ru.job4j.oop;

public class Student {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song("I believe I can fly");
        petya.song("I believe I can fly");
        petya.song("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song(String str) {
        System.out.println(str);
    }
}
