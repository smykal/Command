package com.pilot.command;

import com.pilot.command.Command;

public class Hrv implements Command {
    public static final int FAST = 3;
    public static final int MEDIUM = 2;
    public static final int SLOW = 1;
    public static final int TURN_OF = 0;
    String place;
    int speed;

    public Hrv(String place) {
        this.place = place;
        this.speed = TURN_OF;
    }

    public void hrvFast(){
        speed = FAST;
        System.out.println(place + " speed: " + speed);
        // reszta kodu
    }
    public void hrvMedium(){
        speed = MEDIUM;
        System.out.println(place + " speed: " + speed);
        // reszta kodu
    }
    public void hrvSlow(){
        speed = SLOW;
        System.out.println(place + " speed: " + speed);
        // reszta kodu
    }
    public void hrvTurnOf(){
        speed = TURN_OF;
        System.out.println(place + " speed: " + speed);
        // reszta kodu
    }

    public int getSpeed() {
        return speed;
    }

    public Hrv() {    }

    @Override
    public void run() {
        System.out.println("Wentylator został uruchomiony");
    }

    @Override
    public void back() {

    }

    public void turnOff() {
        System.out.println("Wentylator został wyłączony");
    }
}
