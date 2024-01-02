package org.example.CreationalDesignPatterns.FactoryMethod.factory;

import org.example.CreationalDesignPatterns.FactoryMethod.buttons.Button;
import org.example.CreationalDesignPatterns.FactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
