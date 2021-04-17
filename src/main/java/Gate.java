public class Gate implements Command {
    public Gate() { }

    @Override
    public void run() {

    }

    public void openGate() {
        System.out.println("Brama została otwarta");
    }
    public void closeGate() { System.out.println("Brama została zamknięta"); }
}
