public class CommandGateOpen implements Command{
    Gate gate;

    public CommandGateOpen(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
         gate.openGate();
    }
}
