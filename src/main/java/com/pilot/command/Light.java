package com.pilot.command;

import com.pilot.command.Command;

public class Light implements Command {
    public Light() {  }

    @Override
    public void run() {
        System.out.println("swiatlo w odpalone");
    }

    public void turnOf() {
        System.out.println("światło wyłączone");
    }

    @Override
    public void back() {

    }
}
