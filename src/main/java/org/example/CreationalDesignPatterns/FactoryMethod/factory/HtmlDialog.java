package org.example.CreationalDesignPatterns.FactoryMethod.factory;

import org.example.CreationalDesignPatterns.FactoryMethod.buttons.Button;
import org.example.CreationalDesignPatterns.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
