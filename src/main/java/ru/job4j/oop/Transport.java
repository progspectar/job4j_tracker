package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle plane1 = new Plane();
        Vehicle train = new Train();
        Vehicle train1 = new Train();
        Vehicle bus = new Bus();
        Vehicle bus1 = new Bus();
        Vehicle[] vehicles = new Vehicle[]{plane, train, bus, plane1, train1, bus1};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
