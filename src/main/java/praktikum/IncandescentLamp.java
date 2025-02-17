package praktikum;

public class IncandescentLamp implements Lamp {
    @Override
    public void turnOn() {
        System.out.println("Включить лампу");
    }
    @Override
    public void turnOff() {
        System.out.println("Выключить лампу");
    }
}
