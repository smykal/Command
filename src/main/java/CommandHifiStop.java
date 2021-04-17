public class CommandHifiStop implements Command {
    Hifi hifi;

    public CommandHifiStop(Hifi hifi) {
        this.hifi = hifi;
    }

    @Override
    public void run() {
        hifi.turnOf();
    }
}
