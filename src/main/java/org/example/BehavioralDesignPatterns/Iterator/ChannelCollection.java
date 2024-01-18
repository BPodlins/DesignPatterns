package org.example.BehavioralDesignPatterns.Iterator;

public interface ChannelCollection {
    void addChannel(Channel c);
    void removeChannel(Channel c);
    ChannelIterator iterator(EChannelType type);
}
