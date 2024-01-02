package org.example.CreationalDesignPatterns.AbstractFactory;

import org.example.CreationalDesignPatterns.AbstractFactory.factories.GUIFactory;
import org.example.CreationalDesignPatterns.AbstractFactory.products.buttons.Button;
import org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes.Checkbox;

// App picks the factory type and creates it in runtime, depending on configuration and runtime

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
