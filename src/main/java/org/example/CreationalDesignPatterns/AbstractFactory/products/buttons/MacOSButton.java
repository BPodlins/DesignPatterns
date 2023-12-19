package org.example.CreationalDesignPatterns.AbstractFactory.products.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac button");
    }
}
