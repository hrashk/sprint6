package praktikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FridgeTest { /// start of runner: new FridgeTest()
    @Mock
    Lamp lamp;

    @Spy
    IncandescentLamp inca = new IncandescentLamp();

    Fridge f;

    @BeforeEach
    public void setup() {
        f = new Fridge(lamp);
    }

    @Test
    public void openDoor() {
        f.openDoor();

        Mockito.verify(lamp).turnOn();
    }

    @Test
    public void openRealDoor() {
        var f = new Fridge(inca);

        f.openDoor();

        Mockito.verify(inca).turnOn();
    }

    @Test
    public void closeDoor() {
        f.closeDoor();

        Mockito.verify(lamp).turnOff();
    }
}
