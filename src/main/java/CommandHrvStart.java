public class CommandHrvStart implements Command{
    Hrv hrv;
    @Override
    public void run() {
        hrv.run();
    }

    public CommandHrvStart(Hrv hrv) {
        this.hrv = hrv;
    }
}
