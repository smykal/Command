package com.pilot.command;

import com.pilot.command.Command;

public class Controller {
    Command[] green;
    Command[] red;
    Command back;

    public Controller() {
        green = new Command[7];
        red = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            green[i] = noCommand;
            red[i] = noCommand;
        }
        back = noCommand;
    }
    public void setCommand(int slot, Command green, Command red){
        this.green[slot] = green;
        this.red[slot] = red;
    }

    public void pushedGreen(int slot) {
        green[slot].run();
        back = red[slot];
    }

    public void pushedRed(int slot) {
        red[slot].run();
        back = green[slot];
    }

    public void pushBack() {
        back.back();
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("\n Bla Bla Bla \n");
        for (int i = 0; i < green.length; i++) {
            display.append("[slot nr: " + i + "] " + green[i].getClass().getName());
            display.append(red[i].getClass().getName() + "\n");
        }
        return display.toString();
    }
}
