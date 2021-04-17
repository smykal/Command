package com.pilot.command;

import com.pilot.command.Command;

public class CommandGateOpen implements Command {
    Gate gate;

    public CommandGateOpen(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
         gate.openGate();
    }

    @Override
    public void back() {
        gate.closeGate();
    }
}
