package praktikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FridgeTest {
    @Mock
    Lamp lamp;   // null

    Fridge f;  // <-

    @Spy
    Fridge f2 = new Fridge(new IncandescentLamp());

    @BeforeEach
    void setUp() {
        f = new Fridge(lamp);
    }

    @Test
    void openDoor() {
//        var f = new Fridge(lamp);

        f.openDoor();

        Mockito.verify(lamp).turnOn();
    }

    @Test
    void closeDoor() {
//        var f = new Fridge(lamp);

        f.closeDoor();

        Mockito.verify(lamp).turnOff();
    }

    @Test
    void openDoor2() {
        f2.openDoor();

        Mockito.verify(f2).innerDoor();
//        assertThrows(Exception.class, () -> f.closeDoor());
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "b"})
    void closeDoor3(String input) {
        f.openDoor();
        System.out.println(input);


    }
}
