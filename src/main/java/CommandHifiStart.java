public class CommandHifiStart implements Command {
    Hifi hifi;

    public CommandHifiStart(Hifi hifi) {
        this.hifi = hifi;
    }

    @Override
    public void run() {
        hifi.run();
    }

}
