package praktikum;

public class Fridge {
    private Lamp lamp;

    public Fridge(Lamp lamp) {
        this.lamp = lamp;
    }

    public void openDoor() {
        lamp.turnOn();
    }

    public void closeDoor() {
        lamp.turnOff();
    }
}
