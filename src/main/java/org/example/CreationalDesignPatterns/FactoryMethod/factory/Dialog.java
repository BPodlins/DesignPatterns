package org.example.CreationalDesignPatterns.FactoryMethod.factory;

import org.example.CreationalDesignPatterns.FactoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow(){
        Button ButtonOk = createButton();
    }

    public abstract Button createButton();
}
