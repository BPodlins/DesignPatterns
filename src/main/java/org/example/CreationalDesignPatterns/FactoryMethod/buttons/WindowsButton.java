package org.example.CreationalDesignPatterns.FactoryMethod.buttons;

public class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println("Button Win test");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("OnClick win");
    }
}
