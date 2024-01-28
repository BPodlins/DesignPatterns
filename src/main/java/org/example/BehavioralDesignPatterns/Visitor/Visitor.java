package org.example.BehavioralDesignPatterns.Visitor;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement jsonElement);
}
