package org.example.solid.depinvers;

public class BestManager implements IManager {
    @Override
    public void speak(IDev dev) {
        System.out.println("speak with dev");
        dev.writeCode();
    }
}
