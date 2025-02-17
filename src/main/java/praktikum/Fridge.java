package praktikum;

public class Fridge {
    private SmallDoor door = new SmallDoor();
    private Lamp lamp;

    public Fridge(Lamp lamp) {
        this.lamp = lamp;
    }

    public void open() {
        System.out.println("Открыть дверь холодильника");
        lamp.turnOn();
    }

    public void close() {
        lamp.turnOff();
    }
}
