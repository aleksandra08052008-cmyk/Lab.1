import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testNormalCalculation() {
        double result = Main.calculate(1, 6, 4, 2);
        assertTrue(result >= 0);
    }

    @Test
    void testNoCrash() {
        assertDoesNotThrow(() ->
                Main.calculate(1, 6, 4, 2)
        );
    }

    @Test
    void testDivisionByZeroCase() {
        // спеціально підбираємо C щоб був ризик ділення на 0
        double result = Main.calculate(2, 2, 2, 2);
        assertTrue(result >= 0 || result == 0);
    }
}
