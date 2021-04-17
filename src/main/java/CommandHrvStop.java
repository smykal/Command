public class CommandHrvStop implements Command {
    Hrv hrv;

    @Override
    public void run() {
        hrv.turnOff();
    }

    public CommandHrvStop(Hrv hrv) {
        this.hrv = hrv;
    }
}
