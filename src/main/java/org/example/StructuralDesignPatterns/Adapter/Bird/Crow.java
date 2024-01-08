package org.example.StructuralDesignPatterns.Adapter.Bird;

public class Crow implements Bird{


    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Krrraa");
    }
}
