package org.example.CreationalDesignPatterns.AbstractFactory.products.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Win button");
    }
}
