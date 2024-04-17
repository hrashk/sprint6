package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FridgeTest {
    @Mock
    private Lamp lamp;  // null

    @Spy
    private SmallDoor door = new SmallDoor();


    private Fridge fridge;

    @Before
    public void setUp() {
        fridge = new Fridge(new SmallDoor(), lamp);
    }

    @Test
    public void openDoor() {
//        var f = new Fridge(new SmallDoor(), lamp);

        fridge.openDoor();

        verify(lamp, times(3)).turnOn();
    }

    @Test
    public void closeDoor() {
        var f = new Fridge(door, new HalogenLamp());

//        doThrow(new RuntimeException("hi")).when(door).close(); // stub
        int w = door.getWeight();

        f.closeDoor();

        verify(door).close(); /// spy
    }
}
