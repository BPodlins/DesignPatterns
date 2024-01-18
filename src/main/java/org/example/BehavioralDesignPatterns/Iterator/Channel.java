package org.example.BehavioralDesignPatterns.Iterator;

public class Channel {
    private double frequency;
    private EChannelType TYPE;

    public Channel(double freq, EChannelType type){
        this.frequency=freq;
        this.TYPE=type;
    }

    public double getFrequency() {
        return frequency;
    }

    public EChannelType getTYPE() {
        return TYPE;
    }

    @Override
    public String toString(){
        return "Frequency="+this.frequency+", Type="+this.TYPE;
    }
}
