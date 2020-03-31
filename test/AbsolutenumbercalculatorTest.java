import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AbsolutenumbercalculatorTest {
    @Test
    public void testfinAbsolute(){
        int number = 0;
        int expected = 0;
        int result = Absolutenumbercalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
     public void testfinAbsolute1(){
        int number = 1;
        int expected = 1;
        int result = Absolutenumbercalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
     public void testfindAbsoluteNegative1(){
        int number = -1;
        int expected = 1;
        int result = Absolutenumbercalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}
