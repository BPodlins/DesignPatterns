package org.example.BehavioralDesignPatterns.Visitor;

public class JsonElement extends Element{

    public JsonElement(String s) {
        super(s);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
