package org.example.CreationalDesignPatterns.AbstractFactory.factories;

import org.example.CreationalDesignPatterns.AbstractFactory.products.buttons.Button;
import org.example.CreationalDesignPatterns.AbstractFactory.products.buttons.MacOSButton;
import org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes.Checkbox;
import org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
