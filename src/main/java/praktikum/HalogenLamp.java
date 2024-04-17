package praktikum;

public class HalogenLamp implements Lamp {
    @Override
    public void turnOn() {
        System.out.println("Halogen Lamp is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Halogen Lamp is OFF");
    }
}
