package praktikum;

public class IncandescentLamp implements Lamp {
    @Override
    public void turnOn() {
        System.out.println("Turn on lamp");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off lamp");
    }
}
