package org.example.BehavioralDesignPatterns.Memento;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new  Originator ("data.txt");
        originator.write("*sout of first line\n");
        System.out.println("first edit");
        System.out.print(originator);
        System.out.println("saving state and adding second line");
        caretaker.save(originator);
        originator.write("*writing second line\n");
        System.out.println("sout after second edition");
        System.out.print(originator);
        System.out.println("revert and sout");
        caretaker.undo(originator);
        System.out.print(originator);
    }
}
