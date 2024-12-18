package org.example.solid.liskov;

public class KotlinDev extends Developer {

    @Override
    public void writeCode() {
        System.out.println("Use Kotlin syntax");
    }

    @Override
    public void reaction() {
        System.out.println("Kotlin reaction");
    }
}
