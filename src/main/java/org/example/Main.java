package org.example;

import org.example.cartask.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw");
        car.drive();
        car.stop();
    }
}