package org.example.solid.isp;

public class JavaDev implements InterfaceDeveloper, InterfaceTester {

    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }

    @Override
    public void reaction() {
        System.out.println("Java reaction");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void functionalTest() {

    }
}
