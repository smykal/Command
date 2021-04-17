public class Hrv implements Command{
    public Hrv() {    }

    @Override
    public void run() {
        System.out.println("Wentylator został uruchomiony");
    }

    public void turnOff() {
        System.out.println("Wentylator został wyłączony");
    }
}
