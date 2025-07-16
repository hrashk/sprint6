package praktikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ParamTest {
    @Mock
    Lamp lamp;

    Fridge f;

    @BeforeEach
    public void setup() {
        f = new Fridge(lamp);
    }

    @ParameterizedTest
    @ValueSource(strings = {"alpha", "beta"})
    public void openDoor(String direction) {
        System.out.println(direction);
        f.openDoor();

        Mockito.verify(lamp).turnOn();
    }
}
