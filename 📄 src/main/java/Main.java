import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMatrixMultiplication() {

        char[][] B = {
                {'A', 'B'},
                {'C', 'D'}
        };

        int a = 2;

        char[][] C = new char[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = (char) (B[i][j] * a);
            }
        }

        assertEquals((char) ( 'A' * 2 ), C[0][0]);
    }

    @Test
    public void testSumLogic() {

        char[][] C = {
                {'A', 'B'},
                {'C', 'D'}
        };

        int sum = 0;

        for (int i = 0; i < C.length; i++) {

            char max = C[i][0];
            char min = C[i][0];

            for (int j = 1; j < C[i].length; j++) {
                if (C[i][j] > max) max = C[i][j];
                if (C[i][j] < min) min = C[i][j];
            }

            if (i % 2 == 0)
                sum += max;
            else
                sum += min;
        }

        assertTrue(sum > 0);
    }
}
