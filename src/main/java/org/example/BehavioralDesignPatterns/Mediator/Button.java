package org.example.BehavioralDesignPatterns.Mediator;

public class Button {
    private Mediator mediator;

    public void press() {
        mediator.press();
    }
}
