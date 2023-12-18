package org.example.CreationalDesignPatterns.Builder.builders;

import org.example.CreationalDesignPatterns.Builder.cars.CarType;
import org.example.CreationalDesignPatterns.Builder.cars.Manual;
import org.example.CreationalDesignPatterns.Builder.components.Engine;
import org.example.CreationalDesignPatterns.Builder.components.Transmission;

public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission);
    }
}
