package org.example.CreationalDesignPatterns.AbstractFactory.products.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Win checkbox");
    }
}
