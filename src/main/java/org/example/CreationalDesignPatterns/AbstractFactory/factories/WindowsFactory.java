package org.example.CreationalDesignPatterns.AbstractFactory.factories;

import org.example.CreationalDesignPatterns.AbstractFactory.products.buttons.Button;
import org.example.CreationalDesignPatterns.AbstractFactory.products.buttons.WindowsButton;
import org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes.Checkbox;
import org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
