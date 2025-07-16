package praktikum;

public class IncandescentLamp implements Lamp {
    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }
    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }
}
