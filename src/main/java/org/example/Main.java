package org.example;

import org.example.solid.depinvers.BestManager;
import org.example.solid.depinvers.IManager;
import org.example.solid.depinvers.JavaDev;

public class Main {
    public static void main(String[] args) {
        IManager manager = new BestManager();
        manager.speak(new JavaDev());
    }
}