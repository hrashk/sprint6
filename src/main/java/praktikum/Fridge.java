package praktikum;

public class Fridge {
    private Lamp lamp;

    public Fridge(Lamp lamp) {
        this.lamp = lamp;
    }

    public void open() {
        System.out.println("open fridge door");
        lamp.turnOn();
    }

    public Lamp getLamp() {
        return lamp;
    }
}
