package org.example.CreationalDesignPatterns.Prototype;

public class PineTree extends Tree{
    public PineTree(float mass, float height) {
        super(mass, height);
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }
}
