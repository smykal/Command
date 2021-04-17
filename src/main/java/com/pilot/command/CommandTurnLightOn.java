package com.pilot.command;

import com.pilot.command.Command;

public class CommandTurnLightOn implements Command {
    Light light;

    public CommandTurnLightOn(Light light){
        this.light = light;
    }

    @Override
    public void run() {
        light.run();
    }

    @Override
    public void back() {
        light.turnOf();
    }
}
