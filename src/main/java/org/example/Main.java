package org.example;

import org.example.computertask.Computer;
import org.example.computertask.Monitor;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer", new Monitor("Asus"));

        computer.on();
        computer.off();
    }
}