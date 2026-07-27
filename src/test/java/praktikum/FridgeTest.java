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
    private Lamp lamp;

    @Spy
    HalogenLamp halo = new HalogenLamp();


    private Fridge f;

    @BeforeEach
    void initFridge() {  /// lamp -= mock lamp
         f = new Fridge(lamp);
    }

    @Test
    void openDoor() {
        f.openDoor();   // f.lamp == null

        Mockito.verify(lamp).turnOn();  /// lamp - real mock
    }

    @Test
    void closeDoor() {
        f.closeDoor();

        Mockito.verify(lamp).turnOff();
    }


    @ParameterizedTest
    @ValueSource(strings = {"Turn on halogen lamp", "Turn off halogen lamp"})
    void openHalogen(String src) {
        var f = new Fridge(halo);
        System.out.println(src);
        f.openDoor();   // f.lamp == null

        Mockito.verify(halo).turnOff();
    }

}
