package org.example.BehavioralDesignPatterns.Memento;

public class Originator {

    private String fileName;
    private StringBuilder content;

    public Originator(String file) {
        this.fileName = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void revert(Memento memento) {
        this.fileName = memento.getFileName();
        this.content = memento.getContent();
    }
}
