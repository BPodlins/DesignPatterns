package org.example.BehavioralDesignPatterns.Mediator;

public class PowerSupplier {
    private boolean loop = false;
    public void turnOn() {
        loop = true;
        System.out.println(loop);
    }

    public void turnOff() {
        loop = false;
        System.out.println(loop);
    }
}
