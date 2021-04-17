package com.pilot.command;

import com.pilot.command.Command;

public class NoCommand implements Command {
    @Override
    public void run() {
        System.out.println("brak poleceń");
    }

    @Override
    public void back() {

    }
}
