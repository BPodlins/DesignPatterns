package org.example.CreationalDesignPatterns.Prototype;

public class PlasticTree extends Tree{
    public PlasticTree(float mass, float height) {
        super(mass, height);
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }
}
