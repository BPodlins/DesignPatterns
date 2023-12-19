package org.example.CreationalDesignPatterns.AbstractFactory.factories;

import org.example.CreationalDesignPatterns.AbstractFactory.products.buttons.Button;
import org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
