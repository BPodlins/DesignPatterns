package org.example.BehavioralDesignPatterns.State;

public class Client {
    public static void main(String[] args) {
        Context fan = new Context();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
        fan.request();
        System.out.println(fan);
    }
}
