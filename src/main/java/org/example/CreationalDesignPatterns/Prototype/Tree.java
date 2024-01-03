package org.example.CreationalDesignPatterns.Prototype;

public abstract class Tree {

    private float mass;
    private float height;

    private float position;

    public Tree(float mass, float height){

    }

    public abstract Tree copy();

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }
}
