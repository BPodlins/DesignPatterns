package org.example.BehavioralDesignPatterns.Memento;

public class Memento {
    private String fileName;
    private StringBuilder content;

    public Memento(String file, StringBuilder content) {
        this.fileName = file;
        this.content = new StringBuilder(content);
    }

    public String getFileName() {
        return fileName;
    }

    public StringBuilder getContent() {
        return content;
    }
}
