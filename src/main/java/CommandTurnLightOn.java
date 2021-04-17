public class CommandTurnLightOn implements Command{
    Light light;

    public CommandTurnLightOn(Light light){
        this.light = light;
    }

    @Override
    public void run() {
        light.run();
    }
}
