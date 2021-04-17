package com.pilot.command;

import com.pilot.command.Command;

public class CommandGateClose implements Command {
    Gate gate;

    public CommandGateClose(Gate gate) { this.gate = gate; }

    @Override
    public void run() {
        gate.closeGate();
    }

    @Override
    public void back() {
        gate.openGate();
    }
}
