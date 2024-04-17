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


// stub - dummy mock
//
//

@RunWith(Parameterized.class)
public class ParamTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.LENIENT);

    @Mock
    private Lamp lamp;  // null

    @Spy
    private SmallDoor door = new SmallDoor();

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{};
    }

//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void test() {}
}
