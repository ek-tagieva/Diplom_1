import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
   public class BunParameterizedTest {
   private String name;
   private float price;

    public BunParameterizedTest(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters
    public static Object[][] getBunData(){
        return new Object[][]{
                {"Флюоресцентная булка R2-D3", 1.5f},
                {"Краторная булка N-200i", 2.0f},
                {"Флюоресцентная булка R2-D3", -150000000000000000000000000000f},
                {"Kratornay bulka N-200i", 0},
                {"异体字", 1/2},
                {" ", 0},
                {null, -900000000000000000000000000000f},
                {"булкабулкабулкабулкабулкабулкабулкабулкабулка", 99.99f},
                {"!@#$%^&*()vfdb", +5}

        };
    }
    @Test
       public void getBunWithNameAndPrice(){
        Bun bun = new Bun(name, price);
        assertEquals(name, bun.getName());
        assertEquals(price, bun.getPrice(), 0.01);
    }
}
