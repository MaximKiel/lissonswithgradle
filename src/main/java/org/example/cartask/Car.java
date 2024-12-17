package org.example.cartask;

public class Car implements InterfaceCar{

    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name + " drive");
    }

    @Override
    public void stop() {
        System.out.println(name + " stop");
    }
}
