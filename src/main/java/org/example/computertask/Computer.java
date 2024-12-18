package org.example.computertask;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Computer implements InterfaceComputer {

    private String name;
    private InterfaceMonitor monitor;

    @Override
    public void on() {
        System.out.println("Компьютер " + name + " включился, используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер " + name + " выключился, используется монитор " + monitor.getName());
    }
}