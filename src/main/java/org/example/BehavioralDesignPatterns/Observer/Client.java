package org.example.BehavioralDesignPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer obj1 = new MyTopicSub("Obj1");
        Observer obj2 = new MyTopicSub("Obj2");
        Observer obj3 = new MyTopicSub("Obj3");

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        obj1.update();

        topic.postMessage("New Message");

    }
}
