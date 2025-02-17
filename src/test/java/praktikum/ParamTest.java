package praktikum;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

@RunWith(Parameterized.class)
public class ParamTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

    @Mock
    private Lamp lamp;

    @Spy
    private HalogenLamp halogenLamp = new HalogenLamp();

    @Parameterized.Parameters
    public static Object[][] dataGen() {
        return  new Object[][]{};
    }

    @Test
    public void someLamp() {}
}
