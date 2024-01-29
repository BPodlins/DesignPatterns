package org.example.BehavioralDesignPatterns.Memento;

public class Caretaker {
    private Memento obj;

    public void save(Originator originator) {
        this.obj = originator.save();
    }

    public void undo(Originator originator) {
        originator.revert(obj);
    }
}
