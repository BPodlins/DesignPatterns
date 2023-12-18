package org.example.CreationalDesignPatterns.Builder.builders;

import org.example.CreationalDesignPatterns.Builder.cars.CarType;
import org.example.CreationalDesignPatterns.Builder.components.Engine;
import org.example.CreationalDesignPatterns.Builder.components.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}
