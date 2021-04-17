package com.pilot.command;

public class CommandHrvFast implements Command{
    Hrv hrv;
    int previousSpeed;

    public CommandHrvFast(Hrv hrv) {
        this.hrv = hrv;
    }

    @Override
    public void run() {
        previousSpeed = hrv.getSpeed();
        hrv.hrvFast();
    }

    @Override
    public void back() {
        if (previousSpeed == Hrv.FAST) {
            hrv.hrvFast();
        } else if (previousSpeed == Hrv.MEDIUM) {
            hrv.hrvMedium();
        } else if (previousSpeed == Hrv.SLOW) {
            hrv.hrvSlow();
        } else if (previousSpeed == Hrv.TURN_OF) {
            hrv.turnOff();
        }
    }
}