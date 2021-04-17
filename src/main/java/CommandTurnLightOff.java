public class CommandTurnLightOff implements Command {
    Light light;

    public CommandTurnLightOff(Light light) {
        this.light = light;
    }

    @Override
    public void run() {
        light.turnOf();
    }
}
