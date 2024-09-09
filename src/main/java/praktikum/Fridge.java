package praktikum;

/**
 * Fridge
 * - door - open
 * - lamp - turnOn
 */
public class Fridge {
    private final Door door;
    private final IncandescentLamp lamp;

    public Fridge(Door door, IncandescentLamp lamp) {
        this.door = door;
        this.lamp = lamp;
    }


    public void openDoor() {
        System.out.println("Open fridge door");
        door.open();
        lamp.turnOn();
    }
}
