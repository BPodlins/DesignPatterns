package org.example.CreationalDesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println("If you see no value then singleton created and if the value is the same, than it was reused" + "\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("Singleton 1");
        Singleton anotherSingleton = Singleton.getInstance("Singleton 2");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
