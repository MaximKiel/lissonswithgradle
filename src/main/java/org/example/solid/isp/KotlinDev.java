package org.example.solid.isp;

public class KotlinDev implements InterfaceDeveloper {

    @Override
    public void writeCode() {
        System.out.println("Use Kotlin syntax");
    }

    @Override
    public void reaction() {
        System.out.println("Kotlin reaction");
    }
}
