import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import praktikum.Bun;

@RunWith(MockitoJUnitRunner.class)
public class BunTest {
    private Bun bun;
    @Before
    public void setUp() {
        bun = new Bun("black bun", 2.5f);
    }

    @Test
    public void getNameBunValue() {
        assertEquals("black bun", bun.getName());
    }

    @Test
    public void getPriceBunValue() {
        assertEquals(2.5f, bun.getPrice(), 0.001);
    }

    @Test
    public void getNameAndPriceBunValue() {
        assertEquals("black bun", bun.getName());
        assertEquals(2.5f, bun.getPrice(), 0.001);
    }
}
