public class NoCommand implements Command {
    @Override
    public void run() {
        System.out.println("brak poleceń");
    }
}
