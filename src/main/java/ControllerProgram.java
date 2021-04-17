public class ControllerProgram {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Light lightDiningroom = new Light();
        Light lightKitchen = new Light();
        Hrv ceelingHrv = new Hrv();
        Gate gate = new Gate();
        Hifi hifi = new Hifi();

        Command diningRoomLightOn = new CommandTurnLightOn(lightDiningroom);
        Command diningRoomLightOff = new CommandTurnLightOff(lightDiningroom);
        Command kitchenRoomLightOn = new CommandTurnLightOn(lightKitchen);
        Command kitchenRoomLightOff = new CommandTurnLightOff(lightKitchen);

        Command ceelingHrvTurnOn = new CommandHrvStart(ceelingHrv);
        Command ceelingHrvTurnOff = new CommandHrvStop(ceelingHrv);

        Command gateOpen = new CommandGateOpen(gate);
        Command gateClose = new CommandGateClose(gate);

        Command hifiStart = new CommandHifiStart(hifi);
        Command hifiStop = new CommandHifiStop(hifi);

        controller.setCommand(0, diningRoomLightOn, diningRoomLightOff);
        controller.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        controller.setCommand(2, ceelingHrvTurnOn, ceelingHrvTurnOff);
        controller.setCommand(3, hifiStart, hifiStop);
        controller.setCommand(4, gateOpen, gateClose);

        System.out.println(controller);

        controller.pushedGreen(1);
        controller.pushedRed(1);
        controller.pushedGreen(2);
        controller.pushedRed(2);
        controller.pushedGreen(3);
        controller.pushedRed(3);
        controller.pushedGreen(4);
        controller.pushedRed(4);

    }
}
