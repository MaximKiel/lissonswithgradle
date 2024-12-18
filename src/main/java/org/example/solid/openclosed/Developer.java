package org.example.solid.openclosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Developer {

    private String langName;

    public void writeCode() {
        System.out.println("Default syntax");
    }

    public void eat() {
        
    }
}