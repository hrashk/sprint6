package praktikum;

public class Fridge {
    private final Lamp lamp;

    public Fridge(Lamp lamp) {
        this.lamp = lamp;
    }

    public void openDoor() {
        System.out.println("Opening Door");
        lamp.turnOn();
        innerDoor();
    }

    public void innerDoor() {
        System.out.println("Inner Door");
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void closeDoor() {
        System.out.println("Closing Door");
        lamp.turnOff();
    }
}
