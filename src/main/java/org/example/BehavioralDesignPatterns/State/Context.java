package org.example.BehavioralDesignPatterns.State;

public class Context {
    private State fanOffState;
    private State fanLowState;

    private State state;

    public Context() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);

        state = fanOffState;
    }

    public void request() {
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }


    @Override
    public String toString() {
        return state.toString();
    }
}
