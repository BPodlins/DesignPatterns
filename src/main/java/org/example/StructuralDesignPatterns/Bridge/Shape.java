package org.example.StructuralDesignPatterns.Bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
    }

    abstract public String draw();
}
