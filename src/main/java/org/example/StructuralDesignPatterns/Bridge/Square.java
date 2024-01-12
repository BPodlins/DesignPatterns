package org.example.StructuralDesignPatterns.Bridge;

public class Square extends Shape{
    public Square(Color color){
        super(color);
    }
    @Override
    public String draw() {
        return null;
    }
}
