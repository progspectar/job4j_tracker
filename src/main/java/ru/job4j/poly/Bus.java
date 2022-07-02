package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("start driving");
    }

    @Override
    public void passengers(int number) {
        System.out.println("number of passengers: " + number);
    }

    @Override
    public double refuel(double amount) {
        return 0;
    }
}
