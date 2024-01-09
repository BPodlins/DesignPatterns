package org.example.StructuralDesignPatterns.Decorator;

import org.example.StructuralDesignPatterns.Decorator.Components.DataSource;
import org.example.StructuralDesignPatterns.Decorator.Decorators.CompressionDecorator;
import org.example.StructuralDesignPatterns.Decorator.Decorators.DataSourceDecorator;
import org.example.StructuralDesignPatterns.Decorator.Decorators.EncryptionDecorator;

public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Doe,245125\nAlbrech Durr, 215552";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
