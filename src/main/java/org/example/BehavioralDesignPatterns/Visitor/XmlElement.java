package org.example.BehavioralDesignPatterns.Visitor;

public class XmlElement extends Element{
    public XmlElement(String s) {
        super(s);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
