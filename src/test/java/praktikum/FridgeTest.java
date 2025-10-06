package praktikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FridgeTest {
    @Mock
    LedLamp lamp;

    @Spy
    IncandescentLamp inca = new IncandescentLamp();

    Fridge f;

    @BeforeEach
    void setup() { // mock init
        f = new Fridge(lamp);
    }

    @Test
    public void openDoor() {  // before each
        f.open();

        Mockito.verify(f.getLamp()).turnOn();
    }

    @Test
    public void openDoor2() {
        f.open();

        Mockito.verify(f.getLamp()).turnOn();
    }

    @Test
    public void openDoor3() {
        f.open();

        Mockito.verify(f.getLamp()).turnOn();
    }

    @Test
    public void openRealDoor() {
        var f = new Fridge(inca);

        f.open();

        Mockito.verify(f.getLamp()).turnOn();
    }
}
