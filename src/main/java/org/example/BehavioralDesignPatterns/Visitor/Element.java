package org.example.BehavioralDesignPatterns.Visitor;

public abstract class Element {

    String str;

    public Element(){

    }

    public Element(String uuid) {
        this.str = uuid;
    }

    public abstract void accept(Visitor v);
}
