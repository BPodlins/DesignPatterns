package org.example.StructuralDesignPatterns.Adapter;

import org.example.StructuralDesignPatterns.Adapter.Bird.Bird;
import org.example.StructuralDesignPatterns.Adapter.BirdToy.ToyDuck;

public class BirdAdapter implements ToyDuck {
    Bird bird;
    public BirdAdapter(Bird bird)
    {
        this.bird = bird;
    }
    @Override
    public void squeak() {
        bird.makeSound();
    }
}
