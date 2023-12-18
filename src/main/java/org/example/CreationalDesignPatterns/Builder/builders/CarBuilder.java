package org.example.CreationalDesignPatterns.Builder.builders;

import org.example.CreationalDesignPatterns.Builder.cars.Car;
import org.example.CreationalDesignPatterns.Builder.cars.CarType;
import org.example.CreationalDesignPatterns.Builder.components.Engine;
import org.example.CreationalDesignPatterns.Builder.components.Transmission;

public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission);
    }
}
