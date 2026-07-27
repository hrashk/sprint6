package praktikum;

public class Fridge {
    private final Lamp lamp;

    public Fridge(Lamp lamp) {
        this.lamp = lamp;
    }

    public void openDoor() {
        System.out.println("Open fridge door");
        lamp.turnOn();
    }

    public void closeDoor() {
        System.out.println("Close fridge door");
        lamp.turnOff();
    }
}
