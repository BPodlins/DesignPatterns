package org.example.BehavioralDesignPatterns.State;

public class FanLowState implements State{
    private final Context fan;

    public FanLowState(Context fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Turning off the fan");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "fan speed - slow";
    }
}
