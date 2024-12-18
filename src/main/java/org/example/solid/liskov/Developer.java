package org.example.solid.liskov;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Developer {

    private String langName;

    public void writeCode() {
        System.out.println("Default syntax");
    }

    public void reaction() {
        System.out.println("Default reaction");
    }
}