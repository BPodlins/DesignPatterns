package org.example.StructuralDesignPatterns.Decorator.Components;

public interface DataSource {
    void writeData(String data);

    String readData();
}
