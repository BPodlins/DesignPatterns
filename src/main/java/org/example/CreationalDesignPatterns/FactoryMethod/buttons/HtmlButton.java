package org.example.CreationalDesignPatterns.FactoryMethod.buttons;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Test btn");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click yes");
    }
}
