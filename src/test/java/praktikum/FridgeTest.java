package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class FridgeTest {
    @Mock
    private Lamp lamp;

    @Spy
    private HalogenLamp halogenLamp = new HalogenLamp();

    Fridge f;

    @Before
    public void setUp() {
        f = new Fridge(lamp);
    }

    @Test
    public void open() {
        assertNotNull(lamp);

        f.open();

        Mockito.verify(lamp).turnOn();
    }

    @Test
    public void close() {
        assertNotNull(lamp);

        f.close();

        Mockito.verify(lamp).turnOff();
    }

    @Test
    public void open2() {
        var f = new Fridge(halogenLamp);

        f.open();

        Mockito.verify(halogenLamp).turnOn();
    }
}
