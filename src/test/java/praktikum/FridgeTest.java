package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FridgeTest {
    @Mock
    private Door door;
    @Mock
    private IncandescentLamp lamp;
    @Spy
    IncandescentLamp incaLamp = new IncandescentLamp();


    @Test
    public void openDoor() {
        Fridge fridge = new Fridge(door, lamp);

        fridge.openDoor();

        Mockito.verify(door).open();
        Mockito.verify(lamp).turnOn();
    }

    @Test
    public void openDoorWithRealLamp() {
        Fridge fridge = new Fridge(door, incaLamp);

        fridge.openDoor();

        Mockito.verify(door).open();
        Mockito.verify(incaLamp).turnOn();
    }
}
