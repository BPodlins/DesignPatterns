package org.example.BehavioralDesignPatterns.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element{
    List<Element> elements = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }


    public void addElement(Element element) {
        elements.add(element);
    }


    @Override
    public void accept(Visitor v) {
        for (Element e : this.elements) {
            e.accept(v);
        }
    }
}
