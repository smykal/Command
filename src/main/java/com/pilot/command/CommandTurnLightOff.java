package com.pilot.command;

import com.pilot.command.Command;

public class CommandTurnLightOff implements Command {
    Light light;

    public CommandTurnLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        light.turnOf();
    }

    @Override
    public void back() {
        light.run();
    }
}
