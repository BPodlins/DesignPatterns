package org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Mac checkbox");;
    }
}
