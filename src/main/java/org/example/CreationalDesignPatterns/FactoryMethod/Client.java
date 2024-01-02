package org.example.CreationalDesignPatterns.FactoryMethod;

import org.example.CreationalDesignPatterns.FactoryMethod.factory.Dialog;
import org.example.CreationalDesignPatterns.FactoryMethod.factory.HtmlDialog;
import org.example.CreationalDesignPatterns.FactoryMethod.factory.WindowsDialog;

public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }


    //concrete factory is set by either configuration or local variables

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
