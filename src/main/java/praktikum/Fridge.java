package praktikum;

public class Fridge {
    private SmallDoor door;
    private Lamp lamp;

    public Fridge(SmallDoor door, Lamp lamp) {
        this.door = door;
        this.lamp = lamp;
    }

    public void openDoor() {
        System.out.println("Fridge opened door");
        door.open();
        lamp.turnOn();
    }

    public void closeDoor() {
        System.out.println("Fridge door is closed");
        door.close();
        lamp.turnOff();
    }
}
