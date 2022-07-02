package ru.job4j.oop;

public class Bus implements Vehicle{

    @Override
    public void move() {
        System.out.println("The bus is driving on a highway");
    }
}
