package org.example.StructuralDesignPatterns.Adapter.BirdToy;

public class PlasticToyDuck implements ToyDuck{
    @Override
    public void squeak() {
        System.out.println("sqeaking");
    }
}
