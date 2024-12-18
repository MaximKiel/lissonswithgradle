package org.example.solid.liskov;

public class JavaDev extends Developer {

    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }

    @Override
    public void reaction() {
        System.out.println("Java reaction");
    }
}
