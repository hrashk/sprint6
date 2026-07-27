package praktikum;

public class HalogenLamp implements Lamp {
    @Override
    public void turnOn() {
        System.out.println("Turn on halogen lamp");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off halogen lamp");
    }
}
