package com.pilot.command;

import com.pilot.command.Command;

public class CommandHifiStop implements Command {
    Hifi hifi;

    public CommandHifiStop(Hifi hifi) {
        this.hifi = hifi;
    }

    @Override
    public void run() {
        hifi.turnOf();
    }

    @Override
    public void back() {
        hifi.run();
    }
}
