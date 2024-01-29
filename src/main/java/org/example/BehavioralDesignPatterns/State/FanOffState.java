package org.example.BehavioralDesignPatterns.State;

public class FanOffState implements State{
    private final Context fan;

    public FanOffState(Context fan) {
        this.fan = fan;
    }

    @Override
    public void handle() {
        System.out.println("Speed changed to slow");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "Fan turned on";
    }
}
