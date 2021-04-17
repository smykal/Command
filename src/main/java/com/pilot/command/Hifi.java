package com.pilot.command;

import com.pilot.command.Command;

public class Hifi implements Command {

    public Hifi() {
    }

    @Override
    public void run() {
        System.out.println("com.pilot.command.Hifi uruchomione");
    }

    @Override
    public void back() {

    }

    public void turnOf() {
        System.out.println("hifi wyłączone");
    }

}
