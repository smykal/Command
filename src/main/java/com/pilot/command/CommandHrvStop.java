package com.pilot.command;

import com.pilot.command.Command;

public class CommandHrvStop implements Command {
    Hrv hrv;

    @Override
    public void run() {
        hrv.turnOff();
    }

    public CommandHrvStop(Hrv hrv) {
        this.hrv = hrv;
    }

    @Override
    public void back() {
        hrv.run();
    }
}
